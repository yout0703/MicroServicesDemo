package com.yout.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yout
 * @date 2020/5/27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerWebApplication.class, args);
    }
}