package com.practice.bt6;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.practice.listview.Subject;
import com.practice.listview.SubjectAdapter;

import java.util.ArrayList;

public class CustomAdapterGridViewActivity extends AppCompatActivity {
    GridView grdSubject;
    ArrayList<Subject> arrSubject;
    SubjectAdapter subjectAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        AnhXa();
        subjectAdapter = new SubjectAdapter(getApplicationContext(), R.layout.grid_cell_subject, arrSubject);
        grdSubject.setAdapter(subjectAdapter);
    }

    private void AnhXa() {
        grdSubject = (GridView) findViewById(R.id.girdview_subject);
        arrSubject = new ArrayList<>();
        arrSubject.add(new Subject("Java", "Java 1", R.drawable.java));
        arrSubject.add(new Subject("C#", "C# 1", R.drawable.csharp));
        arrSubject.add(new Subject("PHP", "PHP 1", R.drawable.php));
        arrSubject.add(new Subject("Kotlin", "Kotlin 1", R.drawable.kotlin));
        arrSubject.add(new Subject("Dart", "Dart 1", R.drawable.dart));
        arrSubject.add(new Subject("Dart 2", "Dart 2", R.drawable.dart));
    }

}