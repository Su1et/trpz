package org.example.templates.components;

public class HtmlElement implements Component {
    private String tag;
    private String content;

    public HtmlElement(String tag, String content) {
        this.tag = tag;
        this.content = content;
    }

    @Override
    public String render() {
        return "<" + tag + ">" + content + "</" + tag + ">";
    }
}