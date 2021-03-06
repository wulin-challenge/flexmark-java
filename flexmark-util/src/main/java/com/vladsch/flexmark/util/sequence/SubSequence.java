package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A BasedSequence implementation which wraps original CharSequence to provide a BasedSequence for
 * all its sub sequences, a subSequence() returns a SubSequence from the original base sequence.
 * <p>
 * NOTE: '\0' changed to '\uFFFD' use {@link com.vladsch.flexmark.util.mappers.NullEncoder#decodeNull} mapper to get original null chars.
 * <p>
 */
public final class SubSequence extends BasedSequenceImpl {
    private final @NotNull CharSequence baseSeq;
    private final SubSequence base;
    private final int startOffset;
    private final int endOffset;

    @NotNull
    @Override
    public SubSequence getBaseSequence() {
        return base;
    }

    @Override
    public int getOptionFlags() {
        return baseSeq instanceof BasedOptionsHolder ? ((BasedOptionsHolder) baseSeq).getOptionFlags() : 0;
    }

    @Override
    public boolean allOptions(int options) {
        return baseSeq instanceof BasedOptionsHolder && ((BasedOptionsHolder) baseSeq).allOptions(options);
    }

    @Override
    public boolean anyOptions(int options) {
        return baseSeq instanceof BasedOptionsHolder && ((BasedOptionsHolder) baseSeq).anyOptions(options);
    }

    @Override
    public <T> T getOption(DataKeyBase<T> dataKey) {
        return baseSeq instanceof BasedOptionsHolder ? ((BasedOptionsHolder) baseSeq).getOption(dataKey) : dataKey.get(null);
    }

    @Override
    public @Nullable DataHolder getOptions() {
        return baseSeq instanceof BasedOptionsHolder ? ((BasedOptionsHolder) baseSeq).getOptions() : null;
    }

    @NotNull
    @Override
    public CharSequence getBase() {
        return baseSeq;
    }

    public int getStartOffset() {
        return startOffset;
    }

    public int getEndOffset() {
        return endOffset;
    }

    private SubSequence(CharSequence charSequence) {
        super(charSequence.hashCode());
        assert !(charSequence instanceof BasedSequence);
        base = this;
        baseSeq = charSequence;
        startOffset = 0;
        endOffset = charSequence.length();
    }

    private SubSequence(SubSequence subSequence, int startIndex, int endIndex) {
        super(0);

        assert startIndex >= 0 && endIndex >= startIndex && endIndex <= subSequence.length() : String.format("SubSequence must have startIndex >= 0 && endIndex >= startIndex && endIndex <= %d, got startIndex:%d, endIndex: %d", subSequence.length(), startIndex, endIndex);

        base = subSequence;
        baseSeq = subSequence.baseSeq;
        startOffset = subSequence.startOffset + startIndex;
        endOffset = subSequence.startOffset + endIndex;
    }

    @Override
    public int length() {
        return endOffset - startOffset;
    }

    @NotNull
    @Override
    public Range getSourceRange() {
        return Range.of(startOffset, endOffset);
    }

    @Override
    public int getIndexOffset(int index) {
        SequenceUtils.validateIndexInclusiveEnd(index, length());
        return startOffset + index;
    }

    @Override
    public char charAt(int index) {
        SequenceUtils.validateIndex(index, length());

        char c = baseSeq.charAt(index + startOffset);
        return c == SequenceUtils.NUL ? SequenceUtils.ENC_NUL : c;
    }

    @NotNull
    @Override
    public SubSequence subSequence(int startIndex, int endIndex) {
        SequenceUtils.validateStartEnd(startIndex, endIndex, length());
        return baseSubSequence(startOffset + startIndex, startOffset + endIndex);
    }

    @NotNull
    @Override
    public SubSequence baseSubSequence(int startIndex, int endIndex) {
        SequenceUtils.validateStartEnd(startIndex, endIndex, base.length());
        return startIndex == startOffset && endIndex == endOffset ? this : base != this ? base.baseSubSequence(startIndex, endIndex) : new SubSequence(this, startIndex, endIndex);
    }

    static BasedSequence create(@Nullable CharSequence charSequence) {
        if (charSequence == null) return BasedSequence.NULL;
        else if (charSequence instanceof BasedSequence) return (BasedSequence) charSequence;
        else return new SubSequence(charSequence);
    }

    /**
     * @deprecated use {@link BasedSequence#of(CharSequence)} instead
     */
    @Deprecated
    public static BasedSequence of(CharSequence charSequence) {
        return BasedSequence.of(charSequence);
    }

    /**
     * @deprecated use {@link BasedSequence#of(CharSequence)} instead, followed by subSequence() to extract the range
     */
    @Deprecated
    public static BasedSequence of(CharSequence charSequence, int startIndex) {
        return BasedSequence.of(charSequence).subSequence(startIndex, charSequence.length());
    }

    /**
     * @deprecated use {@link BasedSequence#of(CharSequence)} instead, followed by subSequence() to extract the range
     */
    @Deprecated
    public static BasedSequence of(CharSequence charSequence, int startIndex, int endIndex) {
        return BasedSequence.of(charSequence).subSequence(startIndex, endIndex);
    }
}
