package com.example.quoctuan.quanlybaihat.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.quoctuan.quanlybaihat.R;
import com.example.quoctuan.quanlybaihat.adapter.AlbumAdapter;
import com.example.quoctuan.quanlybaihat.model.Album;

import java.util.ArrayList;

public class XemAlbumActivity extends AppCompatActivity {

    TextView txtSTT,txtMa,txtTen;

    ListView lvAlbum;
    ArrayList<Album> listAlbum = new ArrayList<>();
    AlbumAdapter albumAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_album);

        addControls();
        addEvents();
    }

    private void addControls() {
//        find view
        txtSTT = (TextView) findViewById(R.id.txtSTT);
        txtMa = (TextView) findViewById(R.id.txtMa);
        txtTen = (TextView) findViewById(R.id.txtTen);
//      xử lý listview
        lvAlbum = (ListView) findViewById(R.id.lvAlbum);
        //listAlbum = new ArrayList<>();
//        thêm data

//      Set adapter
        albumAdapter = new AlbumAdapter(XemAlbumActivity.this,
                                        R.layout.xemalbum_item,
                                        listAlbum);
        lvAlbum.setAdapter(albumAdapter);
    }

    private void addEvents() {
    }
}
