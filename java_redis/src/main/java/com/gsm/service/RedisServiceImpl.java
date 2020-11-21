package com.gsm.service;

import com.gsm.dao.UserDao;
import com.gsm.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public String getUser(String id) {
        SysUser user = null;
        if (redisTemplate.opsForValue().get(id) == null) {
            user = userDao.getUser(id);
            redisTemplate.opsForValue().set(id,user);
        }else {
            Object o = redisTemplate.opsForValue().get(id);
            user = (SysUser) o;
        }
        return user.toString();
    }
}