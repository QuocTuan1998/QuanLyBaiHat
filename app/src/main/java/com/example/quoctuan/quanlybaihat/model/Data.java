package com.example.quoctuan.quanlybaihat.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Admin on 4/25/2017.
 */

public class Data {

    public static ArrayList<Album> album(){
        ArrayList<Album> listAlbum = new ArrayList<>();

        Album  album1 =  new Album("123","Nhạc Việt");
        Album  album2 =  new Album("124","Nhạc Âu Mỹ");
        Album  album3 =  new Album("125","Nhạc Hàn");
        listAlbum.add(album1);
        listAlbum.add(album2);
        listAlbum.add(album3);

        BaiHat bh1 = new BaiHat("Hello",new Date(1980,2,20));
        BaiHat bh2 = new BaiHat("Shape of you",new Date(1980,3,20));
        BaiHat bh3 = new BaiHat("Starving",new Date(1980,4,20));
        BaiHat bh4 = new BaiHat("Wiser",new Date(1980,5,20));
        BaiHat bh5 = new BaiHat("bang bang bang",new Date(1980,2,21));
        BaiHat bh6 = new BaiHat("bad boy",new Date(1980,2,22));
        BaiHat bh7 = new BaiHat("Stitches",new Date(1980,2,23));
        BaiHat bh10 = new BaiHat("lạc trôi",new Date(1980,2,24));
        BaiHat bh11 = new BaiHat("đếm ngày xa em",new Date(1980,2,30));
        BaiHat bh12 = new BaiHat("yêu là tha thu",new Date(1980,2,28));

        return listAlbum;
    }
}
