package com.owen.springcloud.cloudturbinenode1.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by owen on 2016/10/24.
 */
@Service
public class HelloService {
    @HystrixCommand(fallbackMethod="fallback")
    public String hello() {
        return "Hello World";
    }
    public String fallback() {
        return "Fallback";
    }
}
