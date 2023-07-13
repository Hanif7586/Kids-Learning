package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BanjonbonnoActivity extends AppCompatActivity {
RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banjonbonno);

         recyclerView=findViewById(R.id.reclerview);

        List<ModelClass>modelClassList=new ArrayList<>();

        modelClassList.add(new ModelClass("ক"));
        modelClassList.add(new ModelClass("খ"));
        modelClassList.add(new ModelClass("গ"));
        modelClassList.add(new ModelClass("ঘ"));
        modelClassList.add(new ModelClass("ঙ"));
        modelClassList.add(new ModelClass("চ"));
        modelClassList.add(new ModelClass("ছ"));
        modelClassList.add(new ModelClass("জ"));
        modelClassList.add(new ModelClass("ঝ"));
        modelClassList.add(new ModelClass("ঞ"));
        modelClassList.add(new ModelClass("ট"));
        modelClassList.add(new ModelClass("ঠ"));
        modelClassList.add(new ModelClass("ড"));
        modelClassList.add(new ModelClass("ঢ"));
        modelClassList.add(new ModelClass("ণ"));
        modelClassList.add(new ModelClass("ত"));
        modelClassList.add(new ModelClass("থ"));
        modelClassList.add(new ModelClass("দ"));
        modelClassList.add(new ModelClass("ধ"));
        modelClassList.add(new ModelClass("ন"));
        modelClassList.add(new ModelClass("প"));
        modelClassList.add(new ModelClass("ফ"));
        modelClassList.add(new ModelClass("ব"));
        modelClassList.add(new ModelClass("ভ"));
        modelClassList.add(new ModelClass("ম"));
        modelClassList.add(new ModelClass("য"));
        modelClassList.add(new ModelClass("র"));
        modelClassList.add(new ModelClass("ল"));
        modelClassList.add(new ModelClass("ষ"));
        modelClassList.add(new ModelClass("স"));
        modelClassList.add(new ModelClass("হ"));
        modelClassList.add(new ModelClass("ড়"));
        modelClassList.add(new ModelClass("য়"));
        modelClassList.add(new ModelClass("ৎ"));
        modelClassList.add(new ModelClass("ং"));
        modelClassList.add(new ModelClass("ঃ"));
        modelClassList.add(new ModelClass("ঁ"));


        Adapter adapter=new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);



        GridLayoutManager layoutManager=new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);






    }
}
