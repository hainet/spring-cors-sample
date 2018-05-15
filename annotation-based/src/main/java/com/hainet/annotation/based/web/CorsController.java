package com.hainet.annotation.based.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    // curl -H 'Origin: hainet.com' -v localhost:8081/cors
    @GetMapping("/cors")
    @CrossOrigin(allowCredentials = "true")
    public String cors() {
        return "Annotation based cors is enabled.";
    }
}
