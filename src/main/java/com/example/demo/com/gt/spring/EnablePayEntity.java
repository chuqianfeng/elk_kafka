package com.example.demo.com.gt.spring;

import com.example.demo.com.gt.entity.PayEntity;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/12/13.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(PayEntity.class)
public @interface EnablePayEntity {
    //加上EnablePayEntity注解后, PayEntity 就会自动注入spring IOC 中 底层在调用import z注解
}
