package com.owen.springcloud.cloudsimpleui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.owen.springcloud.cloudsimpleui.model.User;

@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    final String SERVICE_NAME = "cloud-simple-service";

    public List<User> readUserInfo() {
        return restTemplate.getForObject("http://" + SERVICE_NAME + "/user", List.class);
    }

    private List<User> fallbackSearchAll() {
        System.out.println("HystrixCommand fallbackMethod handle!");
        List<User> ls = new ArrayList<User>();
        User user = new User();
        user.setUsername("TestHystrixCommand");
        ls.add(user);
        return ls;
    }
}
