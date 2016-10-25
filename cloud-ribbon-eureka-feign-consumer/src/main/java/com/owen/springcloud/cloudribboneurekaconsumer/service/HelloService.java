package com.owen.springcloud.cloudribboneurekaconsumer.service;

import com.owen.springcloud.cloudribboneurekaconsumer.model.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by owen on 2016/10/25.
 */
@Service
public class HelloService implements HelloClient {
    @Autowired
    HelloClient feignHelloClient;

    @Override
    public String hello() {
        return this.feignHelloClient.hello();
    }
}
