package com.owen.springcloud.cloudturbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by owen on 2016/10/24.
 */
@SpringBootApplication
@EnableTurbine
public class CloudTurbineApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudTurbineApplication.class).web(true).run(args);
    }
}
