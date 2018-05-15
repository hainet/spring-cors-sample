package com.hainet.filter.based.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    // curl -H 'Origin: hainet.com' -v localhost:8083/cors
    @GetMapping("/cors")
    public String cors() {
        return "Filter based cors is enabled.";
    }
}
