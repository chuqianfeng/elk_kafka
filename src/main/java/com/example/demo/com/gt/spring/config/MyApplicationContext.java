package com.example.demo.com.gt.spring.config;

import com.example.demo.com.gt.entity.MemberEntity;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/12/18.
 */
@Component
public class MyApplicationContext implements ApplicationContextAware{



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        MemberEntity memberEntity = applicationContext.getBean("memberEntity", MemberEntity.class);
        System.out.println("&&&&"+memberEntity);

    }
}
