package org.example.domain;

import lombok.Value;

import java.util.Map;

public class HttpResponse extends HttpMessage {
    final private int statusCode;
    final private Map<String, String> headers;
    final private String body;

    public HttpResponse(int statusCode, Map<String, String> headers, String body) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
    }
}
