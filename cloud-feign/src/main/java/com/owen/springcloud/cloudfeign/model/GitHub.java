package com.owen.springcloud.cloudfeign.model;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by owen on 2016/10/25.
 */
@FeignClient(name = "", url = "https://api.github.com")
public interface GitHub {
    @RequestMapping(value = "/repos/{owner}/{repo}/contributors", method = RequestMethod.GET)
    ResponseEntity<List<Contributor>> contributors(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
}
