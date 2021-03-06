package com.vladsch.flexmark.ext.aside;

import com.vladsch.flexmark.ext.aside.internal.AsideBlockParser;
import com.vladsch.flexmark.ext.aside.internal.AsideNodeRenderer;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import org.jetbrains.annotations.NotNull;

/**
 * Extension for ext_asides
 * <p>
 * Create it with {@link #create()} and then configure it on the builders
 * <p>
 * The parsed pipe prefixed text is turned into {@link AsideBlock} nodes.
 */
public class AsideExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension {
    public static final DataKey<Boolean> EXTEND_TO_BLANK_LINE = new DataKey<>("EXTEND_TO_BLANK_LINE", Parser.BLOCK_QUOTE_EXTEND_TO_BLANK_LINE);
    public static final DataKey<Boolean> IGNORE_BLANK_LINE = new DataKey<>("IGNORE_BLANK_LINE", Parser.BLOCK_QUOTE_IGNORE_BLANK_LINE);
    public static final DataKey<Boolean> ALLOW_LEADING_SPACE = new DataKey<>("ALLOW_LEADING_SPACE", Parser.BLOCK_QUOTE_ALLOW_LEADING_SPACE);
    public static final DataKey<Boolean> INTERRUPTS_PARAGRAPH = new DataKey<>("INTERRUPTS_PARAGRAPH", Parser.BLOCK_QUOTE_INTERRUPTS_PARAGRAPH);
    public static final DataKey<Boolean> INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("INTERRUPTS_ITEM_PARAGRAPH", Parser.BLOCK_QUOTE_INTERRUPTS_ITEM_PARAGRAPH);
    public static final DataKey<Boolean> WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH", Parser.BLOCK_QUOTE_WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH);

    private AsideExtension() {
    }

    public static AsideExtension create() {
        return new AsideExtension();
    }

    @Override
    public void rendererOptions(@NotNull MutableDataHolder options) {

    }

    @Override
    public void parserOptions(MutableDataHolder options) {

    }

    @Override
    public void extend(Parser.Builder parserBuilder) {
        parserBuilder.customBlockParserFactory(new AsideBlockParser.Factory());
    }

    @Override
    public void extend(@NotNull HtmlRenderer.Builder rendererBuilder, @NotNull String rendererType) {
        if (rendererBuilder.isRendererType("HTML")) {
            rendererBuilder.nodeRendererFactory(new AsideNodeRenderer.Factory());
        } else if (rendererBuilder.isRendererType("JIRA")) {
        }
    }
}
