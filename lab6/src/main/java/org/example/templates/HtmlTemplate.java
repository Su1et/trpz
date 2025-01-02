package org.example.templates;

import java.util.List;

public class HtmlTemplate {
    private String content;
    private List<String> dataBindings;

    public HtmlTemplate(String content, List<String> dataBindings) {
        this.content = content;
        this.dataBindings = dataBindings;
    }

    public String getContent() {
        return content;
    }

    public List<String> getDataBindings() {
        return dataBindings;
    }
}
