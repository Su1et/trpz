package org.example.domain;

import java.util.Map;

public class HttpRequest extends HttpMessage {
    final private String method;
    final private String path;
    final private Map<String, String> headers;
    final private String body;


    public HttpRequest(String method, String path, Map<String, String> headers, String body) {
        this.method = method;
        this.path = path;
        this.headers = headers;
        this.body = body;
    }
}
