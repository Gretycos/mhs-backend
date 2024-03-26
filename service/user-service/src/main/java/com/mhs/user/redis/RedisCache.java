package com.mhs.user.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author Tsong
 * @Date 11/03/2024 14:41
 */
@Component
public class RedisCache {
    @Autowired
    public RedisTemplate redisTemplate;

    /**
     * 设置redis集合
     *
     * @param key      redis键
     * @param value    redis值
     * @param timeout  过期时间
     * @param timeUnit 时间单位
     */
    public <T> void setSetObject(final String key, final T value, final Long timeout, final TimeUnit timeUnit) {
        redisTemplate.opsForSet().add(key, value);
        redisTemplate.expire(key, timeout, timeUnit);
    }

    /**
     * 获得缓存的基本对象
     *
     * @param key redis键
     * @return redis值
     */
    public <T> T getCacheObject(final String key) {
        ValueOperations<String, T> operation = redisTemplate.opsForValue();
        return operation.get(key);
    }

    /**
     * 删除单个对象
     *
     * @param key redis键
     * @return boolean
     */
    public boolean deleteObject(final String key, final String value) {
        return redisTemplate.opsForSet().remove(key, value) > 0;
    }
}
