package com.owen.springcloud.cloudsimpleui.web;

import java.util.List;

import com.owen.springcloud.cloudsimpleui.model.User;
import com.owen.springcloud.cloudsimpleui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import cloud.simple.service.UserServiceProvider.FeignUserService;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    //@Autowired
    //FeignUserService feignUserService;

    @RequestMapping(value = "/users")
    public ResponseEntity<List<User>> readUserInfo() {
        List<User> users = userService.readUserInfo();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}
