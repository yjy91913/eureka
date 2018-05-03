package com.ziroom.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Yangjy on 2018/5/3.
 */
@EnableZuulProxy  //@EnableZuulProxy，开启zuul的功能
@EnableEurekaClient   //通过注解@EnableEurekaClient 表明自己是一个eurekaclient
@SpringBootApplication
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
