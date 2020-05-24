package com.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


/**
 * @program: JavaDemo
 * @description: 用户
 * @author: jonsen
 * @create: 2020-04-13 16:15
 **/
@Document(indexName = "test")
@Data
public class User {
    @Id
    private String id;
    private String name;
    private int sex;
    private int age;

}
