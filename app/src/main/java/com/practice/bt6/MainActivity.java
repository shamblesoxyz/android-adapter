package com.practice.bt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtNewSubject;
    Button btnAdd;
    Button btnUpdate;
    Button btnDelete;
    int index = -1;
    ListView lstSubject;
    ArrayList<String> arrSubject;
    ArrayAdapter arrAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //Add data form ArrayList into ListView
        lstSubject = (ListView) findViewById(R.id.listview_subject);
        arrSubject = new ArrayList<>();
        arrSubject.add("Java");
        arrSubject.add("C#");
        arrSubject.add("PHP");
        arrSubject.add("Kotlin");
        arrSubject.add("Dart");
        arrAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrSubject);
        lstSubject.setAdapter(arrAdapter);

        //Show index of item is being clicked
        /*lstSubject.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
            }
        });*/

        //Show list item is being long clicked
        lstSubject.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "" + i + " - " + arrSubject.get(i), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        //Add new subject
        edtNewSubject = (EditText) findViewById(R.id.edittext_new_subject);
        btnAdd = (Button) findViewById(R.id.button_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrSubject.add(edtNewSubject.getText().toString());
                edtNewSubject.setText(null);
                arrAdapter.notifyDataSetChanged();
            }
        });

        //Show exist subject in EditText
        lstSubject.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                edtNewSubject.setText(arrSubject.get(i));
                edtNewSubject.requestFocus();
                edtNewSubject.setSelection(edtNewSubject.length());
                index = i;
            }
        });

        //Update exist subject
        btnUpdate = (Button) findViewById(R.id.button_update);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrSubject.set(index, edtNewSubject.getText().toString());
                edtNewSubject.setText(null);
                arrAdapter.notifyDataSetChanged();
            }
        });

        //Delete exist subject
        btnDelete = (Button) findViewById(R.id.button_delete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrSubject.remove(index);
                edtNewSubject.setText(null);
                arrAdapter.notifyDataSetChanged();
            }
        });

    }
}