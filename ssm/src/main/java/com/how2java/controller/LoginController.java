package com.how2java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerExecutionChain;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/8/20
 * @Version 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("dologin")
    public String doLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println(username+","+password);
        return "listCategory";
    }

    @RequestMapping("login")
    public String doLogin() {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
        ThreadLocal local = new ThreadLocal();
        return "login";
    }
}
