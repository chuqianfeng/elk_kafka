package com.example.demo.com.gt.spring;

import com.example.demo.com.gt.entity.UserEntity;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * Created by Administrator on 2019/12/13.
 */
public class MyFactoryBean implements FactoryBean<UserEntity>{


    @Nullable
    @Override
    public UserEntity getObject() throws Exception {
        return new UserEntity();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return UserEntity.class;
    }
}
