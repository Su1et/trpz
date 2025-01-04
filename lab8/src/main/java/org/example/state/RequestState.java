package org.example.state;

import org.example.domain.HttpRequest;
import org.example.server.RequestHandler;

public interface RequestState {
    void handleRequest(RequestHandler context, HttpRequest request);
}