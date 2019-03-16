package com.qc.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 蓝少宾
 * @create 2019-03-16 9:08
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class User8011App {
    public static void main(String[] args) {
        SpringApplication.run(User8011App.class,args);
    }
}
