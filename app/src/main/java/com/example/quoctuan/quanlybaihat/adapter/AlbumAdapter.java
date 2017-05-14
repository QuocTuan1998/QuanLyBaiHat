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
import com.example.quoctuan.quanlybaihat.activity.XemAlbumActivity;
import com.example.quoctuan.quanlybaihat.model.Album;

import java.util.List;

/**
 * Created by Admin on 4/24/2017.
 */

public class AlbumAdapter extends ArrayAdapter {
    @NonNull Activity context;
    @LayoutRes int resource;
    @NonNull List objects;
    public AlbumAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row = layoutInflater.inflate(this.resource,null);
//        finds view
        TextView txtSTT = (TextView) row.findViewById(R.id.txtSTT);
        TextView txtMa = (TextView) row.findViewById(R.id.txtMa);
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);

        Album album = (Album) this.objects.get(position);

        for (int i = 0;i  <= position;i++ ){
            txtSTT.setText("" + (i+1));
            txtMa.setText(album.getMa());
            txtTen.setText(album.getTen());
        }

        return  row;
    }
}
