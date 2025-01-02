package org.example.templates;

import java.nio.file.Path;
import java.util.Map;

public abstract class TemplateEngine {

    public String renderHtml(Path page, Map<String, String> data) {
        HtmlTemplate template = renderTemplate(page);
        String renderedContent = template.getContent();
        for (String entry : template.getDataBindings()) {
            String placeholder = "{{" + entry + "}}";
            renderedContent = renderedContent.replace(placeholder, data.get(entry));
        }
        return renderedContent;
    }

    protected abstract HtmlTemplate renderTemplate(Path page);

}
