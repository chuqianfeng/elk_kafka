package com.example.demo.com.gt.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/12/18.
 */
//@Component
public class MemberEntity implements InitializingBean,DisposableBean{
    //afterPropertiesSet 等同于 initMethod = "initMethod"
    //对象创建,对象属性,对象set 方法设置后执行
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet====>MemberEntity");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy===>MemberEntity");
    }

    public MemberEntity() {
        System.out.println("MemberEntity===>构造函数");
    }
}
