package com.owen.springcloud.cloudeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by owen on 2016/10/21.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaConsumerApplication.class, args);
    }
}
