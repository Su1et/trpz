package org.example.templates;

import org.example.templates.components.Component;
import org.example.templates.components.HtmlComposite;
import org.example.templates.components.HtmlElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CHtmlTemplateEngine extends TemplateEngine {

    @Override
    protected Component renderTemplate(Path page) {
        try {
            String content = new String(Files.readAllBytes(page));

            return parseHtml(content);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Component parseHtml(String html) {
        // TODO add chtml syntax logic

        List<Component> children = new ArrayList<>();
        int i = 0;

        while (i < html.length()) {
            if (html.charAt(i) == '<') {
                int tagEnd = html.indexOf('>', i);
                if (tagEnd == -1) break;

                String tagContent = html.substring(i + 1, tagEnd);
                boolean isClosingTag = tagContent.startsWith("/");

                if (isClosingTag) {
                    return new HtmlComposite("parentTag", children);
                }

                String tag = tagContent.split(" ")[0];

                int contentStart = tagEnd + 1;
                int contentEnd = html.indexOf("</" + tag + ">", contentStart);

                if (contentEnd == -1) break;

                String content = html.substring(contentStart, contentEnd);

                children.add(new HtmlElement(tag, content));
                i = contentEnd + tag.length() + 3;
            }
            i++;
        }

        return new HtmlComposite("root", children);
    }
}