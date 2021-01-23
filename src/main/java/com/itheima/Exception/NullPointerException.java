package com.itheima.Exception;
/**
 *
 * 自定义异常类，做提示
 *
 * */
public class NullPointerException extends Exception {

    private String mac;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
