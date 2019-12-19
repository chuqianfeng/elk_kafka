package com.example.demo.com.gt.spring.config;

import com.example.demo.com.gt.entity.MemberEntity;
import com.example.demo.com.gt.entity.PayEntity;
import com.example.demo.com.gt.entity.UserEntity;
import com.example.demo.com.gt.spring.EnablePayEntity;
import com.example.demo.com.gt.spring.MyFactoryBean;
import org.springframework.context.annotation.*;

/**
 * Created by Administrator on 2019/12/12.
 */
@Configuration
@EnablePayEntity
@ComponentScan("com.example.demo.com.gt.entity")
//@Import(MyApplicationContext.class)
public class mySpringConfig {

//    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
//    UserEntity userEntity(){
//        return new UserEntity();
//    }

//    @Bean
//    public MyFactoryBean myFactoryBean(){
//        return new MyFactoryBean();
//    }


}
