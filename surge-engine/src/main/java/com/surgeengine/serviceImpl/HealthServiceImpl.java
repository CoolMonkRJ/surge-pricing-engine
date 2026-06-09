package com.surgeengine.serviceImpl;

import com.surgeengine.service.HealthService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class HealthServiceImpl implements HealthService {

    private final String appVersion;
    private final String environment;

    public HealthServiceImpl(
            @Value("${app.version:1.0.0}") String appVersion,
            @Value("${spring.profiles.active:development}") String environment
    ) {
        this.appVersion = appVersion;
        this.environment = environment;
    }

    @Override
    public HealthResponse getHealthStatus() {
        return new HealthResponse(
                "UP",
                Instant.now(),
                appVersion,
                environment
        );
    }
}