package com.gsm.service.impl;

import com.gsm.dao.LogDao;
import com.gsm.entity.User;
import com.gsm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao ;

    @Override
    public String insertSth(User user) {
        logDao.insertSth(user);
        return "success";
    }

    @Override
    public void deleteSth(String name) {
        logDao.deleteSth(name);
    }
}
