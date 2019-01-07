package com.example.atanu.listview_flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         String[] country = {"India", "China", "Nepal","USA","UK","Japan"};

         int[] countryImages = {R.drawable.india, R.drawable.china, R.drawable.nepal,
                 R.drawable.usa, R.drawable.uk, R.drawable.japan};

//        ListAdapter countryAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,country);
//
          ListView countryView = (ListView) findViewById(R.id.flagList);

//        countryView.setAdapter(countryAdapter);
//
//        countryView.setOnItemClickListener(
//                new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        String country = String.valueOf(parent.getItemAtPosition(position));
//                        Toast.makeText(MainActivity.this,country,Toast.LENGTH_LONG).show();
//
//                    }
//                }
//        );



        MyAdapter myAdapter = new MyAdapter(country,countryImages,MainActivity.this);
        countryView.setAdapter(myAdapter);
    }
}
