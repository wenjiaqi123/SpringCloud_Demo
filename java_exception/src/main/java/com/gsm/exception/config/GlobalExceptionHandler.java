package com.gsm.exception.config;

import com.gsm.exception.entity.Code;
import com.gsm.exception.entity.ExceptionResult;
import com.gsm.exception.entity.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public R handler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        ExceptionResult exceptionResult = new ExceptionResult();
        if(true){
            exceptionResult.setMessage(e.getMessage());
            exceptionResult.setPath(request.getRequestURI());
        }

        R r = R.builder()
                .flag(false)
                .code(Code.ERROR.code)
                .msg(Code.ERROR.msg)
                .data(exceptionResult)
                .build();
        return r;
    }
}
