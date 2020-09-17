package com.gsm.service.impl;

import com.gsm.dao.RegisterDao;
import com.gsm.entity.SysUser;
import com.gsm.service.RegisterService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;

    @Override
    public boolean selectIphoneNo(String iphoneNo) {
        Integer count = registerDao.selectIphoneNo(iphoneNo);
        boolean flag = true;
        if (count == null || count < 1) {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean insertUser(SysUser user) {
        String pwd = user.getPo();
        String encode = BCrypt.hashpw(pwd, BCrypt.gensalt());
        System.out.println(encode);
        long l = System.currentTimeMillis();
        user.setUserId(l);
        user.setPo(encode);
        registerDao.insertUser(user);
        return true;
    }
}
