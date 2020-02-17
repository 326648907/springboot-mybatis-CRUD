package com.kuang.service;

public class CustomExcepiton extends RuntimeException {

    // 错误信息
    private String errorMsg;
    // 服务器状态码
    private Integer status;

    public CustomExcepiton(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public CustomExcepiton(Integer status, String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public Integer getStatus() {
        return status;
    }

}