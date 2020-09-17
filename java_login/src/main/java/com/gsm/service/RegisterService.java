package com.gsm.service;

import com.gsm.entity.SysUser;

public interface RegisterService {
    //查询手机号是否存在
    boolean selectIphoneNo(String iphoneNo);

    boolean insertUser(SysUser user);
}
