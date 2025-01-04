package org.example.templates;

import org.example.templates.components.Component;

import java.io.IOException;
import java.nio.file.Path;

public abstract class TemplateEngine {

    public String renderHtml(Path page) throws IOException {
        return renderTemplate(page).render();
    }

    protected abstract Component renderTemplate(Path page) throws IOException;
}