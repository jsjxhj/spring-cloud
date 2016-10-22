package com.owen.springcloud.cloudeurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by owen on 2016/10/21.
 */
@RestController
@RequestMapping("/consume")
public class EurekaConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/{applicationName}/{api}")
    public String getServiceInstances(@PathVariable String applicationName, @PathVariable String api) {
        return restTemplate.getForEntity("http://" + applicationName + "/" + api, String.class).getBody();
    }

    @RequestMapping("/{applicationName}/{api}/{serviceName}")
    public String getServiceInstancesByApplicationName(@PathVariable String applicationName,
                                                       @PathVariable String api,
                                                       @PathVariable String serviceName) {
        return restTemplate.getForEntity("http://" + applicationName + "/" + api + "/" + serviceName, String.class).getBody();
    }
}
