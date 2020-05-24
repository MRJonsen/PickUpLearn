package com;

import redis.clients.jedis.*;

import java.util.HashSet;

public class JedisClient {

    public static void main(String[] args) {
//        HashSet<HostAndPort> hostAndPorts = new HashSet<HostAndPort>();
//        hostAndPorts.add(new HostAndPort("180.76.136.234",6379));
//        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxTotal(100);
//        config.setMaxIdle(10);
//        config.setTestOnBorrow(true);
//        JedisCluster jedisCluster = new JedisCluster(hostAndPorts, 5000, 3000, 3, "chenbin252", config);
//        jedisCluster.set("s","s");
//        System.out.println(jedisCluster.get("s"));

        Jedis jedis = new Jedis("180.76.136.234",6379);
        jedis.auth("chenbin252");
        jedis.set("s","s");
        System.out.println(jedis.get("s"));
        jedis.monitor(new JedisMonitor() {
            @Override
            public void onCommand(String command) {

            }
        });

    }

}
