package com.gsm.exception.config;

import com.gsm.exception.entity.Code;
import com.gsm.exception.entity.R;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @RestControllerAdvice controller响应体通知     封装返回结果集
 * @ControllerAdvice("com.gsm.controller") 只对controller包下接口作用，【为了避免swagger报错】
 */
@RestControllerAdvice
@ControllerAdvice("com.gsm.controller")
public class GlobalResultAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        //return false 就不执行下面 beforeBodyWrite() 方法
        return true;
    }

    /**
     * 封装
     *
     * @param o               返回数据对象【就是Controller层中，处理器[请求接口]的返回值】
     * @param methodParameter 处理器的方法参数
     * @param mediaType
     * @param aClass
     * @param request
     * @param response
     * @return 真实返回给前台对象
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest request, ServerHttpResponse response) {
        if (o instanceof R) {
            //处理 code
            Integer code = ((R) o).getCode();
            if (code == null) {
                code = Code.SUCCESS.code;
                ((R) o).setCode(code);
            }
            //处理 msg
            String msg = ((R) o).getMsg();
            String iMsg = "";
            //遍历该 code 对应的 msg
            Code[] values = Code.values();
            for (Code i : values) {
                if (i.getCode().equals(code)) {
                    iMsg = i.getMsg();
                    break;
                }
            }
            if (msg == null || "".equals(msg.trim())) {
                ((R) o).setMsg(iMsg);
            } else {
                ((R) o).setMsg(iMsg + ";" + msg);
            }
        }
        return o;
    }
}
