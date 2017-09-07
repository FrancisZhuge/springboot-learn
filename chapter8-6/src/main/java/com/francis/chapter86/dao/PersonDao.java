package com.francis.chapter86.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

}
