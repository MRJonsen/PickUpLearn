package com.dao;

import com.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: JavaDemo
 * @description:
 * @author: jonsen
 * @create: 2020-04-13 16:27
 **/
public interface UserDao extends CrudRepository<User, String> {
}
