package org.example.templates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CHtmlTemplateEngine extends TemplateEngine {

    @Override
    protected HtmlTemplate renderTemplate(Path page) {
        try {
            String content = Files.readString(page);
            List<String> dataBindings = extractBindings(content, "\\{\\{chtml:([^}]+)\\}\\}");
            return new HtmlTemplate(content, dataBindings);
        } catch (IOException e) {
            System.out.println("Помилка!");
            return new HtmlTemplate("", new ArrayList<>());
        }
    }

    private List<String> extractBindings(String content, String regex) {
        List<String> bindings = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            bindings.add(matcher.group(1).trim());
        }
        return bindings;
    }
}
