package org.example.domain;

import lombok.Value;

import java.util.Map;

@Value
public class HttpResponse extends HttpMessage {
    int statusCode;
    Map<String, String> headers;
    String body;

    public HttpResponse(int statusCode, Map<String, String> headers, String body) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
    }
}
