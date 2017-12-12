package com.owen.springcloud.cloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by owen on 2016/10/28.
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulFilterServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulFilterServerApplication.class, args);
    }
}
