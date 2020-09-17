package com.gsm.dao;

import com.gsm.entity.SysUser;

public interface RegisterDao {
    Integer selectIphoneNo(String iphoneNo);

    void insertUser(SysUser user);
}
