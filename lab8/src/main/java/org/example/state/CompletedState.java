package org.example.state;

import org.example.domain.HttpRequest;
import org.example.domain.HttpResponse;
import org.example.domain.RequestStatistics;
import org.example.server.RequestHandler;

public class CompletedState implements RequestState {
    @Override
    public void handleRequest(RequestHandler context, HttpRequest request) {
        long startTime = System.currentTimeMillis();
        System.out.println("Обробка запиту завершена.");
        HttpResponse response = null;
        long endTime = System.currentTimeMillis();
        long processingTime = endTime - startTime;
        RequestStatistics statistics = new RequestStatistics(
                startTime,
                request.getMethod(),
                request.getPath(),
                response.getStatusCode(),
                processingTime
        );
        context.getMediator().updateStatistics(statistics);
    }
}