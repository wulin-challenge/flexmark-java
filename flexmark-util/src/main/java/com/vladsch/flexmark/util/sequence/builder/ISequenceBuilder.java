package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.sequence.IRichSequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ISequenceBuilder<T extends ISequenceBuilder<T, S>, S extends IRichSequence<S>> {
    /**
     * NOTE: returns non-null value if the underlying {@link IBasedSegmentBuilder#getBaseSubSequenceRange()} returns non-null value
     *
     * @return sub-sequence of base representing the single segment or null if sequence not representable by a single subsequence
     */
    @Nullable S getSingleBasedSequence();
    @NotNull T getBuilder();

    @NotNull
    default T addAll(Iterable<? extends CharSequence> sequences) {
        return append(sequences);
    }

    @NotNull
    default T append(Iterable<? extends CharSequence> sequences) {
        for (CharSequence chars : sequences) {
            append(chars, 0, chars.length());
        }
        //noinspection unchecked
        return (T) this;
    }

    @NotNull
    default T add(@Nullable CharSequence chars) {
        return append(chars);
    }

    @NotNull
    default T append(@Nullable CharSequence chars) {
        if (chars != null) {
            return append(chars, 0, chars.length());
        }
        //noinspection unchecked
        return (T) this;
    }

    @NotNull
    default T append(@Nullable CharSequence chars, int startIndex) {
        if (chars != null) {
            return append(chars, startIndex, chars.length());
        }
        //noinspection unchecked
        return (T) this;
    }

    @NotNull T append(@Nullable CharSequence chars, int startIndex, int endIndex);
    @NotNull T append(char c);
    @NotNull T append(char c, int count);
    @NotNull S toSequence();

    int length();
    boolean isEmpty();

    default boolean isNotEmpty() {
        return !isEmpty();
    }
}
