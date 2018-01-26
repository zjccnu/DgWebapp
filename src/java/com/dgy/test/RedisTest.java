package com.dgy.test;

import redis.clients.jedis.Jedis;

/**
 * Created by zjccnu on 2018/1/24.
 */
public class RedisTest {
     private static Jedis jedis;
    public static void getConn(){
        jedis = new Jedis("127.0.0.1", 6379);
    }
    public static void main(String[] args){
        getConn();
        jedis.set("aa","bbb");
        System.out.println(jedis.get("aa"));
    }
}
