package com.owen.springcloud.cloudribboneurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by owen on 2016/10/25.
 */
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    private String serviceName = "cloud-ribbon-eureka-service";

    @RequestMapping("/")
    public String hello() {
        return restTemplate.getForObject("http://" + serviceName + "/", String.class);
    }

    /**
     * LoadBalanced 注解表明restTemplate使用LoadBalancerClient执行请求
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        RestTemplate template = new RestTemplate();
        SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory) template.getRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(3000);
        return template;
    }
}
