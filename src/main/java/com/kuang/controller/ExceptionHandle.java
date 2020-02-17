package com.kuang.controller;

import com.kuang.entity.Result;
import com.kuang.service.CustomExcepiton;
import com.kuang.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)//捕获异常
    @ResponseBody
    public <T> Result<T> handle(Exception e) {
        //如果是自定义异常 抛出与前端约定好的数值 如果没有自定义没有传值
        if (e instanceof CustomExcepiton) {
            CustomExcepiton exception = (CustomExcepiton) e;
            return ResultUtil.error(exception.getStatus(), e.getMessage());
        }
        //如果其他异常
        return ResultUtil.error(500, e.getMessage() == null ? "服务器内部错误" : e.getMessage());
    }

}