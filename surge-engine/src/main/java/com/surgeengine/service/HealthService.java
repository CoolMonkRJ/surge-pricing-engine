package com.surgeengine.service;

import com.surgeengine.dto.response.HealthResponse;

public interface HealthService {

    HealthResponse getHealthStatus();
}