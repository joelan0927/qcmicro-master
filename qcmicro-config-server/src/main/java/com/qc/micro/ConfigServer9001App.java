package com.qc.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 蓝少宾
 * @create 2019-03-15 17:34
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer9001App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer9001App.class,args);
    }
}
