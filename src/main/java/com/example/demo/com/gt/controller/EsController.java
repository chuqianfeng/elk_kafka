package com.example.demo.com.gt.controller;

import com.example.demo.com.gt.entity.UserEntity;
import com.example.demo.com.gt.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by Administrator on 2019/10/24.
 */
@RestController
public class EsController {
    @Autowired
    private UserDao userDao;

    //添加文档
    @RequestMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity userEntity){
        UserEntity save = userDao.save(userEntity);
        return save;
    }
    //查询文档
    @RequestMapping("/findById")
    public Optional<UserEntity> findById(String id){
        return userDao.findById(id);

    }


}
