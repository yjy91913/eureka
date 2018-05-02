package com.ziroom.eureka.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Yangjy on 2018/4/28.
 */
@Configuration
public class BeanConfiguration {

    @Bean
    @LoadBalanced    //LoadBalanced注解表明这个restTemplate开启负载均衡的功能。
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
