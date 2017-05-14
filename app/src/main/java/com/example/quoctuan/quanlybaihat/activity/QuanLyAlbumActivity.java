package com.example.quoctuan.quanlybaihat.activity;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.quoctuan.quanlybaihat.R;
import com.example.quoctuan.quanlybaihat.adapter.AlbumAdapter;
import com.example.quoctuan.quanlybaihat.adapter.BaiHatAdapter;
import com.example.quoctuan.quanlybaihat.model.Album;
import com.example.quoctuan.quanlybaihat.model.BaiHat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class QuanLyAlbumActivity extends AppCompatActivity {

    EditText editTen,editNgay;
    Button btnNgay,btnThemBH;

    Spinner spAlbum;
    ArrayList<Album> listAlbum;
    ArrayAdapter<Album> albumAdapter;

    ListView lvBaiHat;
    ArrayList<BaiHat> listBH;
    BaiHatAdapter baiHatAdapter;

    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_album);

        addControls();
        addEvents();
    }

    private void addControls() {

        editTen = (EditText) findViewById(R.id.editTen);
        editNgay = (EditText) findViewById(R.id.editNgay);
        btnNgay = (Button) findViewById(R.id.btnNgay);
        btnThemBH = (Button) findViewById(R.id.btnThemBH);

        spAlbum = (Spinner) findViewById(R.id.spAlbum);

        albumAdapter = new ArrayAdapter<Album>(QuanLyAlbumActivity.this,
                                                android.R.layout.simple_list_item_1,
                                                MainActivity.listAlbum);
        albumAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAlbum.setAdapter(albumAdapter);


//        find view
        lvBaiHat = (ListView) findViewById(R.id.lvBaiHat);
        listBH = new ArrayList<>();
        baiHatAdapter = new BaiHatAdapter(QuanLyAlbumActivity.this,
                                        R.layout.quanlybaihat_item,
                                        listBH);

        listBH.add(new BaiHat("Bala",new Date(2000-1900,10,5)));
        listBH.add(new BaiHat("Bola",new Date(2000-1900,10,5)));
        listBH.add(new BaiHat("Bcla",new Date(2000-1900,10,5)));
        listBH.add(new BaiHat("Bdla",new Date(2000-1900,10,5)));
        listBH.add(new BaiHat("Bela",new Date(2000-1900,10,5)));

        lvBaiHat.setAdapter(baiHatAdapter);

    }

    private void addEvents() {

        btnNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyNgay();
            }
        });
        btnThemBH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = editTen.getText().toString();

//                BaiHat baiHat = new BaiHat(ten,calendar.getTime());
                baiHatAdapter.notifyDataSetChanged();
            }
        });

    }

    private void xuLyNgay() {

        final DatePickerDialog.OnDateSetListener callBack = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                editNgay.setText(dfm.format(calendar.getTime()));
            }
        };
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                                                            callBack,
                                                            calendar.get(Calendar.YEAR),
                                                            calendar.get(Calendar.MONTH),
                                                            calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();

    }


}
