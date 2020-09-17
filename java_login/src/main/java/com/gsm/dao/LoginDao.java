package com.gsm.dao;

import com.gsm.entity.SysUser;

public interface LoginDao {
    SysUser selectUserByIphoneNo(String iphoneNo);
}
