package com.owen.springcloud.cloudhystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by owen on 16/5/1.
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class CloudHystrixApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudHystrixApplication.class).web(true).run(args);
    }
}
