package com.fashionstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Fashion E-Commerce Backend Application Entry Point
 * 
 * This is the main Spring Boot application class that starts the REST API server.
 * 
 * Technologies:
 * - Java 25 LTS
 * - Spring Boot 3.4.x
 * - Spring Data JPA
 * - Spring Security + JWT
 * - PostgreSQL
 * 
 * @author Fashion E-Commerce Team
 * @version 1.0.0
 */
@SpringBootApplication
public class FashionEcommerceApplication {

    /**
     * Main method - Entry point for Spring Boot application
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(FashionEcommerceApplication.class, args);
    }
}