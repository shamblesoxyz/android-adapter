package com.practice.bt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.practice.listview.Subject;
import com.practice.listview.SubjectAdapter;

import java.util.ArrayList;

public class CustomAdapterListViewActivity extends AppCompatActivity {

    EditText edtNewSubject;
    Button btnAdd;
    Button btnUpdate;
    Button btnDelete;
    int index = -1;
    ListView lstSubject;
    ArrayList<Subject> arrSubject;
    SubjectAdapter subjectAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        AnhXa();
        subjectAdapter = new SubjectAdapter(getApplicationContext(), R.layout.row_subject, arrSubject);
        lstSubject.setAdapter(subjectAdapter);
    }

    private void AnhXa() {
        lstSubject = (ListView) findViewById(R.id.listview_subject);
        edtNewSubject = (EditText) findViewById(R.id.edittext_new_subject);
        btnAdd = (Button) findViewById(R.id.button_add);
        btnUpdate = (Button) findViewById(R.id.button_update);
        btnDelete = (Button) findViewById(R.id.button_delete);

        arrSubject = new ArrayList<>();
        arrSubject.add(new Subject("Java", "Java 1", R.drawable.java));
        arrSubject.add(new Subject("C#", "C# 1", R.drawable.csharp));
        arrSubject.add(new Subject("PHP", "PHP 1", R.drawable.php));
        arrSubject.add(new Subject("Kotlin", "Kotlin 1", R.drawable.kotlin));
        arrSubject.add(new Subject("Dart", "Dart 1", R.drawable.dart));
    }

}