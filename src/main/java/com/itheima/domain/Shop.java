package com.itheima.domain;

import java.util.Date;
/*
* 商品表
* */
public class Shop {

    private int bookid;

    private String bookshopid;

    private String bookname;

    private Date bookage;

    private String booklb;

    private double bookjprices;

    private double pricesd;

    private String home;

    private double pricedd;

    private int booksl;

    private String bookimage;

    public Shop() {
    }

    public Shop(int bookid, String bookshopid, String bookname, Date bookage, String booklb, double bookjprices, double pricesd, String home, double pricedd, int booksl, String bookimage) {
        this.bookid = bookid;
        this.bookshopid = bookshopid;
        this.bookname = bookname;
        this.bookage = bookage;
        this.booklb = booklb;
        this.bookjprices = bookjprices;
        this.pricesd = pricesd;
        this.home = home;
        this.pricedd = pricedd;
        this.booksl = booksl;
        this.bookimage = bookimage;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookshopid() {
        return bookshopid;
    }

    public void setBookshopid(String bookshopid) {
        this.bookshopid = bookshopid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
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

    public double getBookjprices() {
        return bookjprices;
    }

    public void setBookjprices(double bookjprices) {
        this.bookjprices = bookjprices;
    }

    public double getPricesd() {
        return pricesd;
    }

    public void setPricesd(double pricesd) {
        this.pricesd = pricesd;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public double getPricedd() {
        return pricedd;
    }

    public void setPricedd(double pricedd) {
        this.pricedd = pricedd;
    }

    public int getBooksl() {
        return booksl;
    }

    public void setBooksl(int booksl) {
        this.booksl = booksl;
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "bookid=" + bookid +
                ", bookshopid='" + bookshopid + '\'' +
                ", bookname='" + bookname + '\'' +
                ", bookage=" + bookage +
                ", booklb='" + booklb + '\'' +
                ", bookjprices=" + bookjprices +
                ", pricesd=" + pricesd +
                ", home='" + home + '\'' +
                ", pricedd=" + pricedd +
                ", booksl=" + booksl +
                ", bookimage='" + bookimage + '\'' +
                '}';
    }
}