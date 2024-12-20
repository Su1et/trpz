package org.example.state;

import org.example.domain.HttpRequest;
import org.example.server.RequestHandler;

public class CompletedState implements RequestState {
    @Override
    public void handleRequest(RequestHandler context, HttpRequest request) {
        System.out.println("Обробка запиту завершена.");
        context.getStatisticsManager().recordRequest(request);
    }
}