package com.example.a5alumno.ejercicio11_adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A5Alumno on 29/11/2016.
 */

public class MyListAdapter extends ArrayAdapter {
    private Context mContext;
    private List<Item> itemList;


    public MyListAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //super.getView(position,convertView,parent);

        //convertView = LayoutInflater.from(this.getContext()).inflate(R.layout.list_view_custom_layout,parent);
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_view_custom_layout,null);

        //Modificar los campos

        ImageView listRow_ImgView = (ImageView) convertView.findViewById(R.id.image_view_custom_row_layout);
       // listRow_ImgView.setImageResource(this.mContext.getResources().getIdentifier(this.itemList.get(position).getmImage(), "drawable", this.mContext.getPackageName()));
        TextView listRowTitle_TxtView = (TextView) convertView.findViewById(R.id.text_view_tiltle);
        listRowTitle_TxtView.setText(this.itemList.get(position).getmTitle());
        TextView listRowBody_TxtView = (TextView) convertView.findViewById(R.id.text_view_body);
        listRowBody_TxtView.setText(this.itemList.get(position).getmBody());

        return convertView;
    }
}
