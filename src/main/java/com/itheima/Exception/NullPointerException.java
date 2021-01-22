package com.itheima.Exception;
/**
 *
 * 自定义异常类，做提示
 *
 * */
public class NullPointerException extends Exception {

    private Exception e;

    public NullPointerException(Exception e) {
        this.e = e;
    }

    public Exception getE() {
        return e;
    }

    public void setE(Exception e) {
        this.e = e;
    }
}
