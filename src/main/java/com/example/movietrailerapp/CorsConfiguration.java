package com.example.movietrailerapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow CORS for all endpoints
                .allowedOrigins("http://localhost:3000/") // Replace with your React app's domain
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify the HTTP methods allowed
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // Allow sending cookies from the client
    }
}
