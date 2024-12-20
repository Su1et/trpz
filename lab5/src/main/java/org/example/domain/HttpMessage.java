package org.example.domain;

import java.util.Map;

public abstract class HttpMessage {
    Map<String, String> headers;
    String body;
}
