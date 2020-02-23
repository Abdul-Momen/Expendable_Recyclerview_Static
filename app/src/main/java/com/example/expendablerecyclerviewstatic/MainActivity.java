package com.example.expendablerecyclerviewstatic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ExpandableAdapter adapter;
    List<ExpendModel> expendableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        expendableList = new ArrayList<>();


        expendableList.add(new ExpendModel(R.drawable.postplaceholder,"kolla","ouwuorituouervnur uuvurenvurtunv  ug uoigo nig g"," ah hhh hihiah isdhh ahhk hhhak hdhf hadfha sdf hisddkfahk hk h ashdf ahsdhf iahisdhf haskdhf sdhfi  hkhahdf hahdsf shdafh"));
        expendableList.add(new ExpendModel(R.drawable.postplaceholder,"amm","ouwuorituouervnur uuvurenvurtunv  ug uoigo nig g"," ah hhh hihiah isdhh ahhk hhhak hdhf hadfha sdf hisddkfahk hk h ashdf ahsdhf iahisdhf haskdhf sdhfi  hkhahdf hahdsf shdafh"));
        expendableList.add(new ExpendModel(R.drawable.postplaceholder,"jam","ouwuorituouervnur uuvurenvurtunv  ug uoigo nig g"," ah hhh hihiah isdhh ahhk hhhak hdhf hadfha sdf hisddkfahk hk h ashdf ahsdhf iahisdhf haskdhf sdhfi  hkhahdf hahdsf shdafh"));
        expendableList.add(new ExpendModel(R.drawable.postplaceholder,"morgi","ouwuorituouervnur uuvurenvurtunv  ug uoigo nig g"," ah hhh hihiah isdhh ahhk hhhak hdhf hadfha sdf hisddkfahk hk h ashdf ahsdhf iahisdhf haskdhf sdhfi  hkhahdf hahdsf shdafh"));
        expendableList.add(new ExpendModel(R.drawable.postplaceholder,"bilai","ouwuorituouervnur uuvurenvurtunv  ug uoigo nig g"," ah hhh hihiah isdhh ahhk hhhak hdhf hadfha sdf hisddkfahk hk h ashdf ahsdhf iahisdhf haskdhf sdhfi  hkhahdf hahdsf shdafh"));


        adapter = new ExpandableAdapter(expendableList, getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}
