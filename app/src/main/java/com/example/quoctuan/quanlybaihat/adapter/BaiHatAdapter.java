package com.example.quoctuan.quanlybaihat.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.quoctuan.quanlybaihat.R;
import com.example.quoctuan.quanlybaihat.model.BaiHat;

import java.util.List;

/**
 * Created by Admin on 4/25/2017.
 */

public class BaiHatAdapter extends ArrayAdapter {
    @NonNull Activity context;
    @LayoutRes int resource;
    @NonNull List objects;
    public BaiHatAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row = layoutInflater.inflate(this.resource,null);

        TextView txtSTT = (TextView) row.findViewById(R.id.txtSTT);
        TextView txtTenBH = (TextView) row.findViewById(R.id.txtTenBH);
        TextView txtNgay = (TextView) row.findViewById(R.id.txtNgay);

        BaiHat baiHat = (BaiHat) this.objects.get(position);

        for (int i = 0;i <= position;i++){
            txtSTT.setText("" + (i+1));
            txtTenBH.setText(baiHat.getTen());
        }

        return row;
    }
}
