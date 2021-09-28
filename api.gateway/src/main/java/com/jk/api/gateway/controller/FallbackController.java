package com.jk.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/speakerFallback")
    public String speakerServiceFallback() {
        return "User service is down";
    }

    @GetMapping("/sessionFallback")
    public String sessionServiceFallback() {
        return "Session service is down";
    }
}
