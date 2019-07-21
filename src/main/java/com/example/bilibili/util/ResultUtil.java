package com.example.bilibili.util;

public class ResultUtil {
    private Integer state;//状态
    private String msg; //消息

    public static ResultUtil ok(Integer state, String msg, Object data) {
        return new ResultUtil(null);
    }

    public static ResultUtil ok(Object data) {
        return new ResultUtil(data);
    }

    public static ResultUtil ok() {
        return new ResultUtil(200, "success", null);
    }

    public ResultUtil(Integer state, String msg, Object data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    public ResultUtil() {
    }

    public ResultUtil(Object data) {
        this.msg = "success";
        this.state = 200;
        this.data = data;
    }

    private Object data;//数据

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
