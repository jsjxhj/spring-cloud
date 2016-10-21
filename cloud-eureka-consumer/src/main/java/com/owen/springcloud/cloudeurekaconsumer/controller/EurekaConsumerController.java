package com.owen.springcloud.cloudeurekaconsumer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by owen on 2016/10/21.
 */
@RestController
public class EurekaConsumerController {

    @RequestMapping("/consume/{applicationName}")
    public String getServiceInstances(@PathVariable String applicationName) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity("http://" + applicationName + "/service-instances", String.class).getBody();
    }
}
