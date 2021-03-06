package com.owen.springcloud.cloudhystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by owen on 16/5/1.
 * 使用EnableCircuitBreaker或者 EnableHystrix 表明Spring boot工程启用hystrix,两个注解是等价的.
 * EnableHystrixDashboard注解表示启动对hystrix的监控
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class CloudHystrixApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudHystrixApplication.class).web(true).run(args);
    }
}
