package com.gsm.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public enum  Code {
    SUCCESS(20000,"操作成功"),
    ERROR(50000,"操作失败"),

    LOGIN_USER_NOT_EXISTS(20001, "用户不存在"),
    LOGIN_USER_PWD_ERROR(20002, "用户密码错误"),
    SMS_IPHONE_NO_REGEX_ERROR(20003, "手机号不对");


    @Setter @Getter
    public Integer code;
    @Setter @Getter
    public String msg;
}