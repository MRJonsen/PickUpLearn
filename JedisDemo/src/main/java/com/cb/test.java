package com.cb;

import redis.clients.jedis.Jedis;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/9/3
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Jedis localhost = new Jedis("localhost", 6379);
        String a = localhost.get("a");
        System.out.println(a);
        localhost.lpush("b","a","b");
    }
}
