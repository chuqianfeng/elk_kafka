package com.example.demo.com.gt.spring;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.com.gt.entity.UserEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cqf
 * @apiNote spring 原理分析
 */
public class springDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(UserEntity.class);
        UserEntity userEntity = (UserEntity)annotationConfigApplicationContext.getBean("userEntity");
        userEntity.setAge(11);
        System.out.println(JSONObject.toJSONString(userEntity));



    }


}
