package com.owen.springcloud.cloudsimpleservice.web;

import java.util.List;

import com.owen.springcloud.cloudsimpleservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.owen.springcloud.cloudsimpleservice.model.User;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> readUserInfo() {
        List<User> ls = userService.searchAll();
        return ls;
    }
}
