package com.owen.springcloud.cloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by owen on 2016/10/21.
 */
@SpringBootApplication
@EnableEurekaServer
public class TurbineEurekaServerApplication {
    public static void main(String[] args){
        SpringApplication.run(TurbineEurekaServerApplication.class, args);
    }
}
