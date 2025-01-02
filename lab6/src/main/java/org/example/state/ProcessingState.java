package org.example.state;

import org.example.domain.HttpRequest;
import org.example.server.RequestHandler;

public class ProcessingState implements RequestState {
    @Override
    public void handleRequest(RequestHandler context, HttpRequest request) {
        System.out.println("Обробка запиту...");
        context.setState(new RespondingState());
        context.getState().handleRequest(context, request);
    }
}
