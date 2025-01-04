package org.example.domain;

import lombok.Value;

@Value
public class RequestStatistics {
    long timestamp;
    String method;
    String path;
    int responseStatus;
    long processingTime;
}
