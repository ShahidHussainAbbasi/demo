package maxtheservice.devops.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import maxtheservice.devops.demo.service.CircuitbreakerService;

@RestController
public class CircuitBreakerController {
 
    private final CircuitbreakerService circuitbreakerService;

    public CircuitBreakerController(CircuitbreakerService circuitbreakerService) {
        this.circuitbreakerService = circuitbreakerService;
    }

    @GetMapping("/test")
    public String testCircuitBreaker() {
        return circuitbreakerService.callExternalService();
    }
    
} 
