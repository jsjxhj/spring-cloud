package com.owen.springcloud.cloudribboneurekaconsumer.controller;

import com.owen.springcloud.cloudribboneurekaconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by owen on 2016/10/25.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hello() {
        return helloService.hello();
    }

}
