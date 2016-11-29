package com.example.a5alumno.ejercicio11_adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener{

    String [] mListValues = {"Android","iOS", "WindowsMobile", "Blackberry", "WebOS","Ubuntu","Windows7","Max OS X", "Linux", "OS/2",
            "Ubuntu","Windows7","Max OS X", "Linux", "OS/2","Max OS X", "Linux", "OS/2"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView mListView = (ListView) this.findViewById(R.id.listViewMain);

        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);
        //mListView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,mListValues)); //DEFAULT ADAPTER

        List<Item> listItem = new ArrayList<>();

        for(int idx=0;idx< mListValues.length;idx++){
            listItem.add(new Item("@mipmap/ic_launcher",mListValues[idx],"Number: "+idx));
        }

        mListView.setAdapter(new MyListAdapter(this,0,listItem));

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this,"Element "+mListValues[(int) id]+" "+", with ID "+id,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
        return false;
    }
}
