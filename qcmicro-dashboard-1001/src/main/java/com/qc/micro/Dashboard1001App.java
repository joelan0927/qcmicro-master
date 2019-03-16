package com.qc.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 蓝少宾
 * @create 2019-03-15 23:12
 */
@EnableHystrixDashboard
@SpringBootApplication
public class Dashboard1001App {
    public static void main(String[] args) {
        SpringApplication.run(Dashboard1001App.class,args);
    }
}
