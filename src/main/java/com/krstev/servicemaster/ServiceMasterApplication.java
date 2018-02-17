package com.krstev.servicemaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMasterApplication.class, args);
    }

}
