package com.gsm.service;

import com.gsm.dao.CacheDao;
import com.gsm.entity.User;
import com.gsm.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements CacheService {
    @Autowired
    private CacheDao cacheDao;

    /**
     * @Cacheable(value = "user",key = "#id")       使用该注解的方法会在执行后缓存结果
     * @CacheEvict(value="user",key="#id")          使用该注解的方法会在执行前后移除
     * @param id
     * @return
     */
    @Cacheable(value = "user",key = "#id")
    @Override
    public String getUserById(String id) {
        User user = cacheDao.getUserById(id);
        return user.toString();
    }
}
