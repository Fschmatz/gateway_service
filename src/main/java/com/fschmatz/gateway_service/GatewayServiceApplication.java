package com.fschmatz.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class GatewayServiceApplication {

    public static final String HTTP_HTTBIN_ORG = "http://httpbin.org";

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "Coffe"))
                        .uri(HTTP_HTTBIN_ORG + ":80"))
                .route(p -> p.path("/ola")
                        .filters(f -> f.addRequestHeader("Hello", "application/json"))
                        .uri(HTTP_HTTBIN_ORG + "/json"))
                .build();

    }

}
