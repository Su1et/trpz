package org.example.server;

import org.example.domain.HttpMessage;

public interface HttpMessageBuilder {
    HttpMessageBuilder addHeader(String key, String value);
    HttpMessageBuilder setBody(String body);
    HttpMessage build();
}
