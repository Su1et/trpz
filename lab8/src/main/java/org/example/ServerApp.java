package org.example;

import org.example.templates.CHtmlTemplateEngine;
import org.example.templates.TemplateEngine;
import org.example.templates.components.Component;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ServerApp {
    public static void main(String[] args) throws IOException {
        Path pagePath = Paths.get("template.chtml");
        TemplateEngine engine = new CHtmlTemplateEngine();

        if (pagePath != null) {
            String html = engine.renderHtml(pagePath);
            System.out.println(html);
        }
    }
}
