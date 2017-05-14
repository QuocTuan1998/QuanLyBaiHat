package com.example.quoctuan.quanlybaihat.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Admin on 4/24/2017.
 */

public class BaiHat implements Serializable {
    private String ten;
    private Date ngay;
    private Album album;

    public BaiHat() {
    }

    public BaiHat(String ten, Date ngay) {
        this.ten = ten;
        this.ngay = ngay;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return this.ten + "" + this.ngay;
    }
}
