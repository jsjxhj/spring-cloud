package com.owen.springcloud.cloudturbinenode01.controller;

import com.owen.springcloud.cloudturbinenode01.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by owen on 2016/10/24.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @RequestMapping("/")
    public String hello() {
        return this.service.hello();
    }
}
