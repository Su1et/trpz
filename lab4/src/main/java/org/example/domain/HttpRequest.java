package org.example.domain;

import lombok.Value;

import java.util.Map;

@Value
public class HttpRequest {
    String method;
    String path;
    Map<String, String> headers;
    String body;
}
