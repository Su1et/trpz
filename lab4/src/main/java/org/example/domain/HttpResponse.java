package org.example.domain;

import lombok.Value;

import java.util.Map;

@Value
public class HttpResponse {
    int statusCode;
    Map<String, String> headers;
    String body;
}
