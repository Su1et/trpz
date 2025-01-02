package org.example.server;

public class HttpMessageDirector {

    public void buildUTF8Message(HttpMessageBuilder builder) {
        builder.addHeader("Charset", "UTF-8");
    }
    public void buildJsonHttpMessage(HttpMessageBuilder builder) {
        buildUTF8Message(builder);
        builder.addHeader("Content-Type", "application/json");
    }

}
