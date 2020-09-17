package com.gsm.service.impl;

import com.gsm.dao.LoginDao;
import com.gsm.entity.SysUser;
import com.gsm.service.LoginService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public boolean getSth(SysUser sysUser) {
        SysUser user = loginDao.selectUserByIphoneNo(sysUser.getIphoneNo());
        boolean flag = false;
        if(BCrypt.checkpw(sysUser.getPo(),user.getPo())){
            flag = true;
        }
        return flag;
    }
}