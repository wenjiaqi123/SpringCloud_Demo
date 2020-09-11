package com.gsm.exception.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class R {
    //是否成功
    private boolean flag = true;
    //返回码与返回信息
    private Integer code;
    //返回信息
    private String msg;
    //返回数据
    private Object data;

    public R() {
        this.flag = true;
        this.code = Code.SUCCESS.code;
        this.msg = Code.SUCCESS.msg;
        this.data = null;
    }

    public R(Object data) {
        this.flag = true;
        this.code = Code.SUCCESS.code;
        this.msg = Code.SUCCESS.msg;
        this.data = data;
        if (data instanceof Code) {
            this.flag = ((Code) data).code.equals(Code.SUCCESS.code) ? true : false;
            this.code = ((Code) data).code;
            this.msg = ((Code) data).msg;
            this.data = null;
        }
    }

    public R(boolean flag, Integer code, String msg, Object data) {
        this.flag = flag;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
