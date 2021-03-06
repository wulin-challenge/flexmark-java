package com.vladsch.flexmark.ext.abbreviation.internal;

import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ext.abbreviation.AbbreviationBlock;
import com.vladsch.flexmark.ext.abbreviation.AbbreviationExtension;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessor;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessorFactory;
import com.vladsch.flexmark.parser.block.ParserState;
import com.vladsch.flexmark.parser.core.ReferencePreProcessorFactory;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// NOT USED, Parsing is done by AbbreviationBlockParser
public class AbbreviationParagraphPreProcessor implements ParagraphPreProcessor {
    private static Pattern ABBREVIATION_BLOCK = Pattern.compile("\\s{0,3}(\\*\\[\\s*.*\\s*\\]:)\\s*[^\n\r]*(?:\r\n|\r|\n|$)");

    @SuppressWarnings("FieldCanBeLocal")
    private final AbbreviationOptions options;
    private final AbbreviationRepository abbreviationMap;

    private AbbreviationParagraphPreProcessor(DataHolder options) {
        this.options = new AbbreviationOptions(options);
        abbreviationMap = AbbreviationExtension.ABBREVIATIONS.get(options);
    }

    @Override
    public int preProcessBlock(Paragraph block, ParserState state) {
        BasedSequence trySequence = block.getChars();
        Matcher matcher = ABBREVIATION_BLOCK.matcher(trySequence);
        int lastFound = 0;
        while (matcher.find()) {
            // abbreviation definition
            if (matcher.start() != lastFound) break;

            lastFound = matcher.end();

            int openingStart = matcher.start(1);
            int openingEnd = matcher.end(1);
            int textEnd = lastFound;
            BasedSequence openingMarker = trySequence.subSequence(openingStart, openingStart + 2);
            BasedSequence text = trySequence.subSequence(openingStart + 2, openingEnd - 2).trim();
            BasedSequence closingMarker = trySequence.subSequence(openingEnd - 2, openingEnd);

            AbbreviationBlock abbreviationBlock = new AbbreviationBlock();
            abbreviationBlock.setOpeningMarker(openingMarker);
            abbreviationBlock.setText(text);
            abbreviationBlock.setClosingMarker(closingMarker);
            abbreviationBlock.setAbbreviation(trySequence.subSequence(openingEnd, textEnd).trim());
            abbreviationBlock.setCharsFromContent();

            block.insertBefore(abbreviationBlock);
            state.blockAdded(abbreviationBlock);

            abbreviationMap.put(abbreviationMap.normalizeKey(abbreviationBlock.getText()), abbreviationBlock);
        }
        return lastFound;
    }

    public static ParagraphPreProcessorFactory Factory() {
        return new ParagraphPreProcessorFactory() {
            @Override
            public boolean affectsGlobalScope() {
                return true;
            }

            @Nullable
            @Override
            public Set<Class<?>> getAfterDependents() {
                return null;
            }

            @Nullable
            @Override
            public Set<Class<?>> getBeforeDependents() {
                HashSet<Class<?>> set = new HashSet<>();
                set.add(ReferencePreProcessorFactory.class);
                return set;
            }

            @Override
            public ParagraphPreProcessor apply(ParserState state) {
                return new AbbreviationParagraphPreProcessor(state.getProperties());
            }
        };
    }
}
