package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.spec.IRenderBase;
import com.vladsch.flexmark.util.ast.IRender;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;

import java.io.IOException;

class HtmlRootNodeRenderer extends IRenderBase {
    final private int htmlExtensions;

    public HtmlRootNodeRenderer() {
        this(null);
    }

    public HtmlRootNodeRenderer(DataHolder options) {
        super(options);
        htmlExtensions = HtmlConverter.getHtmlExtensions(options);
    }

    @Override
    public void render(Node node, Appendable output) {
        assert node instanceof HtmlConverter.RootNode;
        String text = ((HtmlConverter.RootNode) node).myRootNode;
        try {
            output.append(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public IRender withOptions(DataHolder options) {
        return new HtmlRootNodeRenderer(options);
    }
}