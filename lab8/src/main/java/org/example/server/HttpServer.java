package org.example.server;

import org.example.domain.HttpRequest;
import org.example.domain.RequestStatistics;

public class HttpServer implements Mediator {
    private RequestHandler requestHandler;
    private StatisticsManager statisticsManager;

    @Override
    public void updateStatistics(RequestStatistics statistics) {
        statisticsManager.recordStatistics(statistics);
    }

    public void startServer() {
        System.out.println("Server started. Listening for requests...");
    }

    public void stopServer() {
        System.out.println("Server stopped.");
    }
}
