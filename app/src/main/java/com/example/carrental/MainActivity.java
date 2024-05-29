package com.example.carrental;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.carrental.adapter.RecentsAdapter;
import com.example.carrental.adapter.TopPlacesAdapter;
import com.example.carrental.modal.RecentsData;
import com.example.carrental.modal.TopCarsData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now here we will add some dummy data in our model class

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Mountain Car ABC", "USA", "From $500", R.drawable.a));
        recentsDataList.add(new RecentsData("Road Car XYZ", "USA", "From $700", R.drawable.b));
        recentsDataList.add(new RecentsData("Hybrid Car DEF", "USA", "From $600", R.drawable.c));
        recentsDataList.add(new RecentsData("Electric Car GHI", "USA", "From $1,200", R.drawable.d));
        recentsDataList.add(new RecentsData("Folding Car JKL", "USA", "From $800", R.drawable.e));
        recentsDataList.add(new RecentsData("Gravel Car MNO", "USA", "From $900", R.drawable.f));

        setRecentRecycler(recentsDataList);

        List<TopCarsData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopCarsData("Mountain Car XYZ", "USA", "$500 - $1,200", R.drawable.j));
        topPlacesDataList.add(new TopCarsData("Road Car ABC", "USA", "$700 - $1,500", R.drawable.h));
        topPlacesDataList.add(new TopCarsData("Hybrid Car DEF", "USA", "$600 - $1,100", R.drawable.g));
        topPlacesDataList.add(new TopCarsData("Electric Car GHI", "USA", "$1,200 - $2,500", R.drawable.i));
        topPlacesDataList.add(new TopCarsData("Folding Car JKL", "USA", "$800 - $1,400", R.drawable.b));
        setTopPlacesRecycler(topPlacesDataList);


        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopCarsData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }



}
