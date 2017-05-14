package com.example.quoctuan.quanlybaihat.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.quoctuan.quanlybaihat.R;

public class UpdateAlbumActivity extends AppCompatActivity {
    EditText editMa,editTen;
    Button btnXoa,btnUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_album);

        addControls();
        addEvents();
    }

    private void addControls() {

        editMa = (EditText) findViewById(R.id.editMa);
        editTen = (EditText) findViewById(R.id.editTen);

        btnXoa = (Button) findViewById(R.id.btnXoa);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);


    }

    private void addEvents() {

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyUpdate();
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
    }

    private void xuLyUpdate() {
    }


}
