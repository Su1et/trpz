package org.example.server;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.HttpRequest;
import org.example.domain.HttpResponse;
import org.example.domain.RequestStatistics;
import org.example.state.ReceivedState;
import org.example.state.RequestState;

@Getter
public class RequestHandler {
    @Setter
    private RequestState state;
    @Setter
    private Mediator mediator;
    private final ResponseBuilder responseBuilder;
    private final StatisticsManager statisticsManager;

    public RequestHandler(ResponseBuilder responseBuilder, StatisticsManager statisticsManager) {
        this.responseBuilder = responseBuilder;
        this.statisticsManager = statisticsManager;
    }

    public HttpResponse handleRequest(HttpRequest request) {
        this.state = new ReceivedState();
        state.handleRequest(this, request);
        HttpResponse response = null; // TODO
        return response;
    }

}
