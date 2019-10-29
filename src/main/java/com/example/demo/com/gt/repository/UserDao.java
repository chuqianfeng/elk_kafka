package com.example.demo.com.gt.repository;

import com.example.demo.com.gt.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2019/10/24.
 */
public interface UserDao extends CrudRepository<UserEntity,String>{

}
