package org.example.server;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.HttpRequest;
import org.example.domain.HttpResponse;
import org.example.state.ReceivedState;
import org.example.state.RequestState;

@Getter
public class RequestHandler {
    @Setter
    private RequestState state;
    private final ResponseBuilder responseBuilder;
    private final StatisticsManager statisticsManager;

    public RequestHandler(ResponseBuilder responseBuilder, StatisticsManager statisticsManager) {
        this.responseBuilder = responseBuilder;
        this.statisticsManager = statisticsManager;
    }

    public HttpResponse handleRequest(HttpRequest request) {
        this.state = new ReceivedState();
        state.handleRequest(this, request);
        return null; // TODO
    }

}
