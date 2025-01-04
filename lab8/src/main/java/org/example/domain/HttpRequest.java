package org.example.domain;

import lombok.Value;

import java.util.Map;

@Value
public class HttpRequest extends HttpMessage {
    String method;
    String path;
    Map<String, String> headers;
    String body;


    public HttpRequest(String method, String path, Map<String, String> headers, String body) {
        this.method = method;
        this.path = path;
        this.headers = headers;
        this.body = body;
    }
}
