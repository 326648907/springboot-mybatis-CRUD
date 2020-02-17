package com.kuang.utils;

import com.kuang.entity.Result;
import com.kuang.entity.User;

import java.util.List;

public class ResultUtil {
    //成功方法-含参
    public static Result success(List<User> object) {
        Result result = new Result<>();
        result.setStatus(200);
        result.setMsg("全部数据");
        result.setWorkList(object);
        if (object == null){
            result.setCount(0);
        }else {
            result.setCount(object.size());
        }
        return result;
    }
    //成功方法-含参含信息
    public static Result success(List<User> object,String msg) {
        Result result = new Result<>();
        result.setStatus(200);
        result.setMsg(msg);
        result.setWorkList(object);
        if (object == null){
            result.setCount(0);
        }else {
            result.setCount(object.size());
        }
        return result;
    }
    //成功方法-无参
    public static Result success() {
        return success(null);
    }
    //异常方法
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setStatus(code);
        result.setMsg(msg);
        result.setCount(0);
        return result;
    }
}
