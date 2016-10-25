package com.owen.springcloud.cloudribboneurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by owen on 2016/10/21.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RibbonEurekaFeignConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(RibbonEurekaFeignConsumerApplication.class, args);
    }
}
