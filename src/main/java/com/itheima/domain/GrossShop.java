package com.itheima.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/*
* 进货单
* */
public class GrossShop {

    /*@Autowired
    private  Storage storage;*/

    private String ordergoods;//商品订单编号默认是UUID

    private int userid;

    private String kuser;

    private String khlb;

    private int bookid;

    private String bookname;

    private String bookshopid;

    private Date bookage;

    private String bboklb;

    private int jhsl;

    private double jhje;

    private int jhzsl;

    private Date jhtime;

    private Date createtimes;

    private String namesss;

    public GrossShop() {
    }

    public GrossShop(String ordergoods, int userid, String kuser, String khlb, int bookid, String bookname, String bookshopid, Date bookage, String bboklb, int jhsl, double jhje, int jhzsl, Date jhtime, Date createtimes, String namesss) {
        this.ordergoods = ordergoods;
        this.userid = userid;
        this.kuser = kuser;
        this.khlb = khlb;
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookshopid = bookshopid;
        this.bookage = bookage;
        this.bboklb = bboklb;
        this.jhsl = jhsl;
        this.jhje = jhje;
        this.jhzsl = jhzsl;
        this.jhtime = jhtime;
        this.createtimes = createtimes;
        this.namesss = namesss;
    }
    public String getOrdergoods() {
        return ordergoods;
    }

    public void setOrdergoods(String ordergoods) {
        this.ordergoods = ordergoods;
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

    public String getKhlb() {
        return khlb;
    }

    public void setKhlb(String khlb) {
        this.khlb = khlb;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookshopid() {
        return bookshopid;
    }

    public void setBookshopid(String bookshopid) {
        this.bookshopid = bookshopid;
    }

    public Date getBookage() {
        return bookage;
    }

    public void setBookage(Date bookage) {
        this.bookage = bookage;
    }

    public String getBboklb() {
        return bboklb;
    }

    public void setBboklb(String bboklb) {
        this.bboklb = bboklb;
    }

    public int getJhsl() {
        return jhsl;
    }

    public void setJhsl(int jhsl) {
        this.jhsl = jhsl;
    }

    public double getJhje() {
        return jhje;
    }

    public void setJhje(double jhje) {
        this.jhje = jhje;
    }

    public int getJhzsl() {
        return jhzsl;
    }

    public void setJhzsl(int jhzsl) {
        this.jhzsl = jhzsl;
    }

    public Date getJhtime() {
        return jhtime;
    }

    public void setJhtime(Date jhtime) {
        this.jhtime = jhtime;
    }

    public Date getCreatetimes() {
        return createtimes;
    }

    public void setCreatetimes(Date createtimes) {
        this.createtimes = createtimes;
    }

    public String getNamesss() {
        return namesss;
    }

    public void setNamesss(String namesss) {
        this.namesss = namesss;
    }

    @Override
    public String toString() {
        return "GrossShop{" +
                "ordergoods=" + ordergoods +
                ", userid=" + userid +
                ", kuser='" + kuser + '\'' +
                ", khlb='" + khlb + '\'' +
                ", bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookshopid='" + bookshopid + '\'' +
                ", bookage=" + bookage +
                ", bboklb='" + bboklb + '\'' +
                ", jhsl=" + jhsl +
                ", jhje=" + jhje +
                ", jhzsl=" + jhzsl +
                ", jhtime=" + jhtime +
                ", createtimes=" + createtimes +
                ", namesss='" + namesss + '\'' +
                '}';
    }
}
