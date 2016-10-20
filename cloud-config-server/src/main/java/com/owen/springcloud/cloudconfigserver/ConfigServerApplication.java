package com.owen.springcloud.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by owen on 2016/10/20.
 * 用@EnableConfigServer激活该应用为配置文件服务器
 * 该应用启动后就会完成：读取远程配置文件，转换为rest接口服务 的功能
 * 要在application.properties中配置远程配置文件读取路径
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
