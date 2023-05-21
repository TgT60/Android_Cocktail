package com.example.recipebookfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recipebookfinal.adapter.CategoryAdapter;
import com.example.recipebookfinal.adapter.ShotsAdapter;
import com.example.recipebookfinal.model.Category;
import com.example.recipebookfinal.model.Shot;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler , shotRecycler;
    CategoryAdapter categoryAdapter;

    ShotsAdapter shotsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1,"Shots"));
        categoryList.add(new Category(2,"Cocktails"));
        categoryList.add(new Category(3,"Lemonade"));
        categoryList.add(new Category(4,"Tea"));
        categoryList.add(new Category(5,"Coffee"));

        setCategoryRecycler(categoryList);

        List<Shot> shotList = new ArrayList<>();
        shotList.add(new Shot(1,"shot","WORK","kill you" ,"#84e1e8"));

        setShotRecycler(shotList);
    }

    private void setShotRecycler(List<Shot> shotList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        shotRecycler = findViewById(R.id.categoryR);
        shotRecycler.setLayoutManager(layoutManager);

        shotsAdapter = new ShotsAdapter(this,shotList);
        shotRecycler.setAdapter(categoryAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryR);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}