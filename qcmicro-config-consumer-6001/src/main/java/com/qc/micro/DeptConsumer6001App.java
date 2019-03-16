package com.qc.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 蓝少宾
 * @create 2019-03-15 23:39
 */
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.qc.micro")
@SpringBootApplication
public class DeptConsumer6001App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer6001App.class,args);
    }
}
