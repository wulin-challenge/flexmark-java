package com.vladsch.flexmark.java.samples;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.profile.pegdown.Extensions;
import com.vladsch.flexmark.profile.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;

public class PegdownOptions2 {
    static boolean headerLinks = false;
    static boolean hardwrap = false;
    static boolean allowHtml = false;
    static String processed;
    static String data = "";

    static final DataHolder OPTIONS = PegdownOptionsAdapter.flexmarkOptions(
            Extensions.ALL - (headerLinks ? 0 : Extensions.ANCHORLINKS)
                    - (hardwrap ? 0 : Extensions.HARDWRAPS) + (allowHtml ? 0 : Extensions.SUPPRESS_ALL_HTML)
            // add your extra extensions here
            //, new ConfluenceWikiLinkExtension()
    ).toMutable()
            // set additional options here:
            //.set(HtmlRenderer.FENCED_CODE_LANGUAGE_CLASS_PREFIX,"")
            ;

    static final Parser PARSER = Parser.builder(OPTIONS).build();
    static final HtmlRenderer RENDERER = HtmlRenderer.builder(OPTIONS).build();
    // use the PARSER to parse and RENDERER to render with pegdown compatibility
    static {
        Node document = PARSER.parse(data);
        processed = RENDERER.render(document);
    }
    public static void main(String[] args) {
        DataHolder OPTIONS = PegdownOptionsAdapter.flexmarkOptions(
                Extensions.ALL - (headerLinks ? 0 : Extensions.ANCHORLINKS)
                        - (hardwrap ? 0 : Extensions.HARDWRAPS) + (allowHtml ? 0 : Extensions.SUPPRESS_ALL_HTML)
                // add your extra extensions here
                //, new ConfluenceWikiLinkExtension()
        ).toMutable()
                // set additional options here:
                //.set(HtmlRenderer.FENCED_CODE_LANGUAGE_CLASS_PREFIX,"")
                .toImmutable();

        Parser PARSER = Parser.builder(OPTIONS).build();
        HtmlRenderer RENDERER = HtmlRenderer.builder(OPTIONS).build();

        String input = "[[test page]]" +
                "";

        Node node = PARSER.parse(input);
        System.out.println(RENDERER.render(node));
    }
}
