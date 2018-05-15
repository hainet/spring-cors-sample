package com.hainet.config.based.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    // curl -H 'Origin: hainet.com' -v localhost:8082/cors
    @GetMapping("/cors")
    public String cors() {
        return "Config based cors is enabled.";
    }
}
