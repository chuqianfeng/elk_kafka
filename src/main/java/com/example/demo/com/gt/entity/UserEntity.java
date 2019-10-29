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
    @Id
    private String id;

    private String name;

    private Integer age;

    private Integer sex;
}
