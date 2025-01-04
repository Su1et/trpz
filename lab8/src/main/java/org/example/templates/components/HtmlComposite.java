package org.example.templates.components;

import java.util.List;

public class HtmlComposite implements Component {
    private String tag;
    private List<Component> children;

    public HtmlComposite(String tag, List<Component> children) {
        this.tag = tag;
        this.children = children;
    }

    @Override
    public String render() {
        StringBuilder html = new StringBuilder();
        html.append("<").append(tag).append(">");
        for (Component child : children) {
            html.append(child.render());
        }
        html.append("</").append(tag).append(">");
        return html.toString();
    }
}