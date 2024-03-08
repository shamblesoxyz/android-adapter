package com.practice.bt6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.practice.recyclerview.SongAdapter;
import com.practice.recyclerview.SongModel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView songRecyclerView;
    private SongAdapter songAdapter;
    private List<SongModel> songModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        songRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_songs);
        songModelList = new ArrayList<>();
        songModelList.add(new SongModel("Chúng Ta Của Tương Lai", "Sơn Tùng M-TP", R.drawable.ctctl));
        songModelList.add(new SongModel("Chúng Ta Của Hiện Tại", "Sơn Tùng M-TP", R.drawable.ctcht));
        songModelList.add(new SongModel("CƠN MƯA NGANG QUA - REMIX 2022 CƠN MƯA NGANG QUA - REMIX 20222222222222", "Sơn Tùng M-TP", R.drawable.cmnq));
        songModelList.add(new SongModel("MAKING MAY WAY", "Sơn Tùng M-TP", R.drawable.mmw));
        songAdapter = new SongAdapter(this, songModelList);
        songRecyclerView.setAdapter(songAdapter);
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        songRecyclerView.setLayoutManager(linearLayoutManager);
    }
}