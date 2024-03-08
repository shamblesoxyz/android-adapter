package com.practice.bt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtNewSubject;
    Button btnAdd;
    Button btnUpdate;
    Button btnDelete;
    ListView lstSubject;
    ArrayList<String> arrSubject;
    ArrayAdapter arrAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstSubject = (ListView) findViewById(R.id.listview_subject);
        arrSubject = new ArrayList<>();
        arrSubject.add("Java");
        arrSubject.add("C#");
        arrSubject.add("PHP");
        arrAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrSubject);
        lstSubject.setAdapter(arrAdapter);
    }
}