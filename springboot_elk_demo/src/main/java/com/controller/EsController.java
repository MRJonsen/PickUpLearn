package com.controller;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @program: JavaDemo
 * @description: ceshi
 * @author: jonsen
 * @create: 2020-04-13 16:30
 **/
@RestController
public class EsController {

    @Autowired
    private UserDao userReposiory;

    @RequestMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userReposiory.save(user);
    }

    @RequestMapping("/findUser")
    public Optional<User> findUser(String id) {
        return userReposiory.findById(id);
    }

    @RequestMapping("/param")
    public String testParam(String user) {
        return user;
    }

}
