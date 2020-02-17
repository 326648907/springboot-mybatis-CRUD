package com.kuang.entity;
public class Result<T> {

    private Integer status;
    private String msg;
    private T workList;
    private Integer count;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getWorkList() {
        return workList;
    }

    public void setWorkList(T workList) {
        this.workList = workList;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}