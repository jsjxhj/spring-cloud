package com.owen.springcloud.cloudribboneurekaconsumer.model;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by owen on 2016/10/25.
 */
@FeignClient("cloud-ribbon-eureka-service")
public interface HelloClient {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String hello();
}
