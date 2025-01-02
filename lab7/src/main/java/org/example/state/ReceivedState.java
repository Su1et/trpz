package org.example.state;

import org.example.domain.HttpRequest;
import org.example.server.RequestHandler;

public class ReceivedState implements RequestState {
    @Override
    public void handleRequest(RequestHandler context, HttpRequest request) {
        System.out.println("Запит отримано. Перехід до стану обробки.");
        context.setState(new ProcessingState());
        context.getState().handleRequest(context, request);
    }
}
