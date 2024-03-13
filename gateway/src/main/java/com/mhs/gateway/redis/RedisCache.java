package com.mhs.gateway.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * @Author Tsong
 * @Date 13/03/2024 22:35
 */
@Component
public class RedisCache {
    @Autowired
    public RedisTemplate redisTemplate;

    public <T> T getCacheObject(final String key) {
        ValueOperations<String, T> operation = redisTemplate.opsForValue();
        return operation.get(key);
    }

}
