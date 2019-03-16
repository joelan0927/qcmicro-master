package com.qc.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 蓝少宾
 * @create 2019-03-16 11:16
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class Zuul1011App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul1011App.class,args);
    }
}
