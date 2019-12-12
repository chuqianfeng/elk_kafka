package com.example.demo.com.gt.spring.config;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.com.gt.entity.UserEntity;
import org.springframework.context.annotation.*;

/**
 * Created by Administrator on 2019/12/12.
 */
@Configuration
@ComponentScan("com.example.demo.com.gt.entity")

public class mySpringConfig {

    @Bean
    UserEntity userEntity(){
        return new UserEntity("1","2",1,2);
    }
}
