package com.gsm.exception.config;

import com.gsm.exception.entity.Code;
import com.gsm.exception.entity.ExceptionResult;
import com.gsm.exception.entity.R;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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

        //数据校验 validated 异常
        if (e instanceof MethodArgumentNotValidException) {
            BindingResult br = ((MethodArgumentNotValidException) e).getBindingResult();
            if (br.hasErrors()) {
                List<ObjectError> errors = br.getAllErrors();
                StringBuilder sb = new StringBuilder();
                //多个数据校验不匹配
                errors.forEach(i -> {
                    sb.append(i.getDefaultMessage()).append(";");
                });
                exceptionResult.setMessage(sb.toString());
            }
        }
        return r;
    }
}
