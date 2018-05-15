package com.hainet.config.based.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        //@formatter:off
        registry
                .addMapping("/**")
                    .allowedMethods(HttpMethod.GET.name())
                    .allowCredentials(true);
        //@formatter:on
    }
}
