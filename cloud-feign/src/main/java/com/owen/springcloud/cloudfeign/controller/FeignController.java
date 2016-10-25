package com.owen.springcloud.cloudfeign.controller;

import com.owen.springcloud.cloudfeign.model.Contributor;
import com.owen.springcloud.cloudfeign.service.GitHubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * Created by owen on 2016/10/25.
 */
@RestController
public class FeignController {
    @Autowired
    GitHubService gitHubService;

    @RequestMapping("/")
    public void test(){
        ResponseEntity< List<Contributor>> responseEntity = gitHubService.contributors("netflix", "feign");
        List<Contributor> contributors = responseEntity.getBody();
        for (Contributor contributor : contributors) {
            System.out.println(contributor.getLogin() + " (" + contributor.getContributions() + ")");
        }
    }
}
