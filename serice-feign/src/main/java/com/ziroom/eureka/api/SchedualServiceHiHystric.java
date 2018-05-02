package com.ziroom.eureka.api;

import org.springframework.stereotype.Component;

/**
 * Created by Yangjy on 2018/5/2.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
