package org.example.server;

import org.example.domain.HttpRequest;

import java.util.HashMap;
import java.util.Map;

public class RequestBuilder implements HttpMessageBuilder {
    private String method;
    private String path;
    private Map<String, String> headers = new HashMap<>();
    private String body;

    public RequestBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    public RequestBuilder setPath(String path) {
        this.path = path;
        return this;
    }

    @Override
    public RequestBuilder addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    @Override
    public RequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public HttpRequest build() {
        return new HttpRequest(method, path, headers, body);
    }
}
