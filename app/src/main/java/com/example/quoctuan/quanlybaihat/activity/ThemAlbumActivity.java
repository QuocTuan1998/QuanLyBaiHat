package com.example.quoctuan.quanlybaihat.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.quoctuan.quanlybaihat.R;

public class ThemAlbumActivity extends AppCompatActivity {
    EditText editTen,editMa;
    Button btnLuu,btnXoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_album);

        addControls();
        addEvents();
    }

    private void addControls() {

        editMa = (EditText) findViewById(R.id.editMa);
        editTen = (EditText) findViewById(R.id.editTen);

        btnLuu = (Button) findViewById(R.id.btnLuu);
        btnXoa = (Button) findViewById(R.id.btnXoa);
    }

    private void addEvents() {

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLuu();
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXoa();
            }
        });
    }

    private void xuLyXoa() {

        editMa.setText("");
        editTen.setText("");
        editMa.requestFocus();

    }

    private void xuLyLuu() {



    }


}
