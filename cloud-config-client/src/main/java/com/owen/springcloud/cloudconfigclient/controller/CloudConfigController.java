package com.owen.springcloud.cloudconfigclient.controller;

import com.owen.springcloud.cloudconfigclient.conf.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by owen on 2016/10/20.
 */
@RestController
@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class CloudConfigController {
    @Autowired
    private DataSourceProperties dataSourceProperties;

    @RequestMapping(value = "/configs", method = RequestMethod.GET)
    public Map<String, String> readUserInfo() {
        Map<String, String> configs = new HashMap<String, String>();
        configs.put("url", dataSourceProperties.getUrl());
        configs.put("username", dataSourceProperties.getUsername());
        configs.put("password", dataSourceProperties.getPassword());
        return configs;
    }
}
