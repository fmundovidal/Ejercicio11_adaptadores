package com.example.a5alumno.ejercicio11_adaptadores;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by A5Alumno on 29/11/2016.
 */

public class Item {
    Context mContext;

    private String mTitle;
    private String mBody;
    private String mImage;

    Item(String imgRef, String aTitle, String aBody){
        this.mTitle = aTitle;
        this.mBody = aBody;
        this.mImage = imgRef;
    }
    public String getmTitle(){
        return this.mTitle;
    }
    public String getmBody(){
        return this.mBody;
    }
    public String getmImage(){
        return  this.mImage;
    }


}
