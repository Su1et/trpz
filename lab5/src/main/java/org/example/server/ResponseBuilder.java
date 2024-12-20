package org.example.server;

import org.example.domain.HttpResponse;

import java.util.HashMap;
import java.util.Map;

public class ResponseBuilder implements HttpMessageBuilder {
    private int statusCode;
    private Map<String, String> headers = new HashMap<>();
    private String body;

    public ResponseBuilder setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @Override
    public ResponseBuilder addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    @Override
    public ResponseBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public HttpResponse build() {
        return new HttpResponse(statusCode, headers, body);
    }
}