package com.example.a5alumno.ejercicio11_adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityRecycleView extends AppCompatActivity {

    private static final String TAG = MainActivityRecycleView.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String [] mListValues = {"Android","iOS", "WindowsMobile", "Blackberry", "WebOS","Ubuntu","Windows7","Max OS X", "Linux", "OS/2",
                "Ubuntu","Windows7","Max OS X", "Linux", "OS/2","Max OS X", "Linux", "OS/2"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_recycler_view);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_main);


        List<Item> listItem = new ArrayList<>();

        for(int idx=0;idx< mListValues.length;idx++){
            listItem.add(new Item("@mipmap/ic_launcher",mListValues[idx],"Number: "+idx));
        }

        recyclerView.setHasFixedSize(true); //optimizar código porque tamaño fijo
        recyclerView.setLayoutManager(new LinearLayoutManager( //cambiando el elemento permite definir si es linear layout, un grid, un staggeredgridlayout, etc...
                this,
                LinearLayoutManager.VERTICAL,
                false)); //para que sea circular o no (false = no)


        /*recyclerView.setLayoutManager(new GridLayoutManager( //cambiando el elemento permite definir si es linear layout, un grid, un staggeredgridlayout, etc...
                this,
                4,
                LinearLayoutManager.HORIZONTAL,
                false));*/
        recyclerView.setAdapter(new MyListAdapterRecycler(this,listItem));
    }
}
