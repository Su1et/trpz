package org.example.state;

import org.example.domain.HttpRequest;
import org.example.domain.HttpResponse;
import org.example.server.RequestHandler;

public class RespondingState implements RequestState {
    @Override
    public void handleRequest(RequestHandler context, HttpRequest request) {
        System.out.println("Формування та відправка відповіді...");
        HttpResponse response = context.getResponseBuilder().buildResponse();
        System.out.println("Відповідь надіслано.");
        context.setState(new CompletedState());
    }
}
