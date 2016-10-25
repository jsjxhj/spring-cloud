package com.lkl.springcloud.ribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by owen on 2016/10/25.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }
}
