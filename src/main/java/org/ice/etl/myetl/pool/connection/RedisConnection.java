/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ice.etl.myetl.pool.connection;

import redis.clients.jedis.Jedis;

/**
 *
 * @author ice
 */
public class RedisConnection {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("redis", "myredis");
    }
}
