package com.ziroom.eureka.controller;

import com.ziroom.eureka.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yangjy on 2018/4/28.
 */

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/test")
    public String test(String name){
        return helloService.hiService(name);
    }


}
