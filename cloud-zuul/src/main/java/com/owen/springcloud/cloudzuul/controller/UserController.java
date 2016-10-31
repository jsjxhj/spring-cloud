package com.owen.springcloud.cloudzuul.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by owen on 2016/10/31.
 */
@RestController
public class UserController {
    @RequestMapping("/users/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }
}
