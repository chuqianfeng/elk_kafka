package com.example.demo.com.gt.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by Administrator on 2019/10/24.
 */
@Document(indexName = "mymayikt",type = "user")
@Data
public class UserEntity {
    private String id;

    private String name;

    private Integer age;

    private Integer sex;

    public UserEntity(String id, String name, Integer age, Integer sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public UserEntity() {
    }
}
