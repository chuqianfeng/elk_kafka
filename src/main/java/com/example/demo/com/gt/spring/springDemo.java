package com.example.demo.com.gt.spring;

import com.example.demo.com.gt.spring.config.mySpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cqf
 * @apiNote spring 原理分析
 */
public class springDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(mySpringConfig.class);
//        UserEntity userEntity = (UserEntity)applicationContext.getBean("userEntity");
//        System.out.println(JSONObject.toJSONString(userEntity));
//        applicationContext.close();
//        String[] names = applicationContext.getBeanDefinitionNames();
//        for(int i =0;i<names.length;i++){
//            System.out.println(names[i]);
//
//        }




    }


}
