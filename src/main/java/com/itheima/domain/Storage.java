package com.itheima.domain;

import java.util.Date;

/*
*
* 库存表
*
* */
public class Storage {

    private int bookid;

    private String bookname;

    private int userid;

    private String kuser;

    private String bookshopid;

    private Date bookage;

    private String booklb;

    private int jhsl;

    private double jhje;


    public Storage() {
    }

    public Storage(int bookid, String bookname, int userid, String kuser, String bookshopid, Date bookage, String booklb, int jhsl, double jhje) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.userid = userid;
        this.kuser = kuser;
        this.bookshopid = bookshopid;
        this.bookage = bookage;
        this.booklb = booklb;
        this.jhsl = jhsl;
        this.jhje = jhje;
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

    public String getBooklb() {
        return booklb;
    }

    public void setBooklb(String booklb) {
        this.booklb = booklb;
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

    @Override
    public String toString() {
        return "Storage{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", userid=" + userid +
                ", kuser='" + kuser + '\'' +
                ", bookshopid='" + bookshopid + '\'' +
                ", bookage=" + bookage +
                ", booklb='" + booklb + '\'' +
                ", jhsl=" + jhsl +
                ", jhje=" + jhje +
                '}';
    }
}