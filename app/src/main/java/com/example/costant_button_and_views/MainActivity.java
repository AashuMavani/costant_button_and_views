package com.example.costant_button_and_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
//ListView listView;
GridView gridView;
Spinner spinner;
AutoCompleteTextView actv;
String arr[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // listView=findViewById(R.id.listview);
        gridView=findViewById(R.id.gridview);
        spinner=findViewById(R.id.spinner);
        actv=findViewById(R.id.actv);

        ArrayAdapter<String>adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arr);
       //listView.setAdapter(adapter);
        gridView.setAdapter(adapter);
        spinner.setAdapter(adapter);
        actv.setAdapter(adapter);
    }
}