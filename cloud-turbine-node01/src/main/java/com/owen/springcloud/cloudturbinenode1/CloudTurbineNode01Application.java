package com.owen.springcloud.cloudturbinenode1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by owen on 16/5/1.
 * 使用EnableCircuitBreaker或者 EnableHystrix 表明Spring boot工程启用hystrix,两个注解是等价的.
 * EnableHystrixDashboard注解表示启动对hystrix的监控
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class CloudTurbineNode01Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudTurbineNode01Application.class).web(true).run(args);
    }
}
