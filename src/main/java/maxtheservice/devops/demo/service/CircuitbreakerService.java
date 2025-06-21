package maxtheservice.devops.demo.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class CircuitbreakerService {

    private static final String SAMPLE_SERVICE = "circuitbreakerService";

    @CircuitBreaker(name = SAMPLE_SERVICE, fallbackMethod="fallbackResponse")
    public String callExternalService() {

        if (Math.random() > 0.5) {
            throw new RuntimeException("Service failed");
        }

        return "Service call succeeded";
    }

    public String fallbackResponse(Exception ex) {
        return "fallback response: " + ex.getMessage();
    }
    
}


