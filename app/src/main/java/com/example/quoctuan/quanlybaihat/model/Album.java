package com.example.quoctuan.quanlybaihat.model;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Admin on 4/23/2017.
 */

public class Album implements Serializable {
    private String ma;
    private String ten;
    private AbstractList<BaiHat> baiHat;

    public Album() {
//        cấp phát bộ nhớ để lưu trữ ds bài hát
        this.baiHat = new ArrayList<BaiHat>();
    }

    public Album(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.baiHat = new ArrayList<BaiHat>();
    }

    public Album(BaiHat baiHat) {
    }

    public AbstractList<BaiHat> getBaiHat() {
        return baiHat;
    }

    public void setBaiHat(AbstractList<BaiHat> baiHat) {
        this.baiHat = baiHat;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void themBH(BaiHat bh){
        this.baiHat.add(bh);
        bh.setAlbum(this);
    }

    @Override
    public String toString() {
        return this.getMa() + "--" + this.ten;
    }
}
