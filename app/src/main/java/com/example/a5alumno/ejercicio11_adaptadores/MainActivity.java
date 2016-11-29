package com.example.a5alumno.ejercicio11_adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String [] mListValues = {"Android","iPhone", "WindowsMobile", "Blackberry", "WebOS","Ubuntu","Windows7","Max OS X", "Linux", "OS/2",
            "Ubuntu","Windows7","Max OS X", "Linux", "OS/2","Max OS X", "Linux", "OS/2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView mListeView = (ListView) this.findViewById(R.id.listViewMain);
        mListeView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mListValues));
        mListeView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this,"Element "+position +", with ID "+id,Toast.LENGTH_SHORT).show();
    }
}
