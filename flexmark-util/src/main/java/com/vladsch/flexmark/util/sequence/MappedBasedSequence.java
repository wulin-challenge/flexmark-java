package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.mappers.CharMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A BasedSequence which maps characters according to CharMapper
 */
final public class MappedBasedSequence extends BasedSequenceImpl implements MappedSequence<BasedSequence>, ReplacedBasedSequence {
    private final CharMapper mapper;
    private final BasedSequence base;

    private MappedBasedSequence(CharMapper mapper, BasedSequence baseSeq) {
        this.base = baseSeq;
        this.mapper = mapper;
    }

    @NotNull
    @Override
    public CharMapper getCharMapper() {
        return mapper;
    }

    @Override
    public char charAt(int index) {
        return mapper.map(base.charAt(index));
    }

    @Override
    public BasedSequence getCharSequence() {
        return base;
    }

    @Override
    public int length() {
        return base.length();
    }

    @Override
    public @NotNull BasedSequence toMapped(CharMapper mapper) {
        return mapper == CharMapper.IDENTITY ? this : new MappedBasedSequence(this.mapper.andThen(mapper), base);
    }

    @NotNull
    @Override
    public BasedSequence sequenceOf(@Nullable CharSequence baseSeq, int startIndex, int endIndex) {
        if (baseSeq instanceof MappedBasedSequence) {
            return startIndex == 0 && endIndex == baseSeq.length() ? (BasedSequence) baseSeq : ((BasedSequence) baseSeq).subSequence(startIndex, endIndex).toMapped(mapper);
        } else return new MappedBasedSequence(mapper, base.sequenceOf(baseSeq, startIndex, endIndex));
    }

    @NotNull
    @Override
    public BasedSequence subSequence(int startIndex, int endIndex) {
        BasedSequence baseSequence = base.subSequence(startIndex, endIndex);
        return baseSequence == base ? this : new MappedBasedSequence(mapper, baseSequence);
    }

    @NotNull
    @Override
    public Object getBase() {
        return base.getBase();
    }

    @NotNull
    @Override
    public BasedSequence getBaseSequence() {
        return base.getBaseSequence();
    }

    @Override
    public int getStartOffset() {
        return base.getStartOffset();
    }

    @Override
    public int getEndOffset() {
        return base.getEndOffset();
    }

    @Override
    public int getIndexOffset(int index) {
        return base.charAt(index) == charAt(index) ? base.getIndexOffset(index) : -1;
    }

    @NotNull
    @Override
    public Range getSourceRange() {
        return base.getSourceRange();
    }

    @NotNull
    @Override
    public BasedSequence baseSubSequence(int startIndex, int endIndex) {
        BasedSequence basedSequence = base.baseSubSequence(startIndex, endIndex);
        return basedSequence == base ? this : new MappedBasedSequence(mapper, basedSequence);
    }

    public static BasedSequence mappedOf(CharMapper mapper, BasedSequence baseSeq) {
        return mappedOf(mapper, baseSeq, 0, baseSeq.length());
    }

    public static BasedSequence mappedOf(CharMapper mapper, BasedSequence baseSeq, int startIndex) {
        return mappedOf(mapper, baseSeq, startIndex, baseSeq.length());
    }

    public static BasedSequence mappedOf(CharMapper mapper, BasedSequence baseSeq, int startIndex, int endIndex) {
        return new MappedBasedSequence(mapper, baseSeq.subSequence(startIndex, endIndex));
    }
}