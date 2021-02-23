package com.itheima.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.Test;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 客户表
*
* 遇到的问题：日期格式转换问题异常解决方法如下
* */
public class Customer {

    private int userid;

    private String kuser;

    private String ktelphone;

    private String khlb;

    private String khemial;

    private String khagt;

//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date kcreatetime;
/*
* 日期转换格式处理
* */
    private String cjtime;

    public String getCjtime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(kcreatetime);
        System.out.println(s);
        return s;
    }

    public Customer() {
    }

    public Customer(int userid, String kuser, String ktelphone, String khlb, String khemial, String khagt, Date kcreatetime) {
        this.userid = userid;
        this.kuser = kuser;
        this.ktelphone = ktelphone;
        this.khlb = khlb;
        this.khemial = khemial;
        this.khagt = khagt;
        this.kcreatetime = kcreatetime;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getKuser() {
        return kuser;
    }

    public void setKuser(String kuser) {
        this.kuser = kuser;
    }

    public String getKtelphone() {
        return ktelphone;
    }

    public void setKtelphone(String ktelphone) {
        this.ktelphone = ktelphone;
    }

    public String getKhlb() {
        return khlb;
    }

    public void setKhlb(String khlb) {
        this.khlb = khlb;
    }

    public String getKhemial() {
        return khemial;
    }

    public void setKhemial(String khemial) {
        this.khemial = khemial;
    }

    public String getKhagt() {
        return khagt;
    }

    public void setKhagt(String khagt) {
        this.khagt = khagt;
    }

    public Date getKcreatetime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(new Date());
        System.out.println(s);
        return kcreatetime;
    }

    public void setKcreatetime(Date kcreatetime) {
        this.kcreatetime = kcreatetime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userid=" + userid +
                ", kuser='" + kuser + '\'' +
                ", ktelphone='" + ktelphone + '\'' +
                ", khlb='" + khlb + '\'' +
                ", khemial='" + khemial + '\'' +
                ", khagt='" + khagt + '\'' +
                ", kcreatetime=" + kcreatetime +
                '}';
    }
}
