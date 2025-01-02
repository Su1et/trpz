package org.example.server;

import lombok.Setter;
import org.example.domain.HttpRequest;
import org.example.domain.RequestStatistics;

public class StatisticsManager {
    @Setter
    private Mediator mediator;
    public void recordStatistics(RequestStatistics statistics) {
        // TODO
    }
}
