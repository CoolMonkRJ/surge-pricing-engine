package com.surgeengine.dto.response;

import java.time.Instant;

public record HealthResponse(
        String status,
        Instant timestamp,
        String version,
        String environment
) {
}