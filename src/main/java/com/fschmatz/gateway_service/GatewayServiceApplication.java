package com.fschmatz.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

    public static final String teste = "http://localhost:9090/error.html";
    public static final String teste2 = "http://localhost:9090/homeTeste.html";

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
               /* .route(p -> p
                        .path("/get")
                        .filters(
                               gatewayFilterSpec -> gatewayFilterSpec.setPath(
                                       "/ola"
                               )
                        )
                        .uri("https://www.google.com/search?q="))*/
                .route(p -> p.path("/teste")
                        .uri(teste))
                .route(p -> p.path("/teste2")
                        .uri(teste2))
                .build();

    }

}
