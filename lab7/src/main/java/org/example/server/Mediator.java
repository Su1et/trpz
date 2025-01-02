package org.example.server;

import org.example.domain.HttpRequest;
import org.example.domain.RequestStatistics;

public interface Mediator {
    void updateStatistics(RequestStatistics statistics);
}
