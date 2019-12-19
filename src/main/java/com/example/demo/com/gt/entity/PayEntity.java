package com.example.demo.com.gt.entity;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/12/13.
 */
@Data
@Component
public class PayEntity implements BeanNameAware,BeanFactoryAware,BeanPostProcessor,InitializingBean{

    public PayEntity() {
        System.out.println("1构造方法");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("2,setBeanFactory");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3,setBeanName");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4,afterPropertiesSet");

    }

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5.postProcessBeforeInitialization");
        return null;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6.postProcessBeforeInitialization");
        return null;
    }
}
