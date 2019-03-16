package com.qc.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 蓝少宾
 * @create 2019-03-15 21:16
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class Dept8001App {
    public static void main(String[] args) {
        SpringApplication.run(Dept8001App.class,args);
    }
}
