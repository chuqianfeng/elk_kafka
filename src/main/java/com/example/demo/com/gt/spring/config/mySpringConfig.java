package com.example.demo.com.gt.spring.config;

import com.example.demo.com.gt.entity.UserEntity;
import com.example.demo.com.gt.spring.EnablePayEntity;
import com.example.demo.com.gt.spring.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/12/12.
 */
@Configuration
@EnablePayEntity
@ComponentScan("com.example.demo.com.gt.entity")
public class mySpringConfig {

    @Bean
    UserEntity userEntity(){
        return new UserEntity("1","2",1,2);
    }

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }


}
