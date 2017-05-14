package com.example.quoctuan.quanlybaihat.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.quoctuan.quanlybaihat.R;
import com.example.quoctuan.quanlybaihat.model.Album;
import com.example.quoctuan.quanlybaihat.model.Data;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnThem,btnXem,btnQuanLy;

    public static ArrayList<Album> listAlbum = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addControls();
        addEvents();
    }

    private void addControls() {
//        find view
        btnThem = (Button) findViewById(R.id.btnThem);
        btnXem = (Button) findViewById(R.id.btnXem);
        btnQuanLy = (Button) findViewById(R.id.btnQuanLy);

        listAlbum = Data.album();

    }

    private void addEvents() {

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyThem();
            }
        });
        btnXem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXem();
            }
        });
        btnQuanLy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyQuanLy();
            }
        });
    }

    private void xuLyQuanLy() {

        Intent intent = new Intent(MainActivity.this,QuanLyAlbumActivity.class);
        startActivity(intent);
    }

    private void xuLyXem() {

        Intent intent = new Intent(MainActivity.this,XemAlbumActivity.class);
        startActivity(intent);
    }

    private void xuLyThem() {

        Intent intent = new Intent(MainActivity.this,ThemAlbumActivity.class);
        startActivity(intent);
    }
}
