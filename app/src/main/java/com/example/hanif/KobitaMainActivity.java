package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class KobitaMainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobita_main);

        recyclerView=findViewById(R.id.rcv);

        ArrayList<Model>arrayList=new ArrayList<>();

        arrayList.add(new Model("আম পাতা জোড়া জোড়া",R.drawable.ampata));
        arrayList.add(new Model("আয় রে আয় টিয়ে",R.drawable.ayrere));
        arrayList.add(new Model("আতা গাছে তোতা পাখি",R.drawable.atagace));
        arrayList.add(new Model("আয় আয় চাঁদ মামা",R.drawable.aychad));
        arrayList.add(new Model(" বাক বাকুম পায়রা !",R.drawable.bakbaku));
        arrayList.add(new Model("হাট্টি মাটি্ম টিম",R.drawable.hatitti));
        arrayList.add(new Model("নোটন নোটন পায়রা",R.drawable.lotonl));
        arrayList.add(new Model("ঘুম পাড়ানি মাসি পিসি",R.drawable.ghumpara));
        arrayList.add(new Model("চাঁদ উঠেছে ফুল ফুটেছে",R.drawable.sonamonir));



kobitaAdapter adapter=new kobitaAdapter(KobitaMainActivity.this,arrayList);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
         recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(adapter);




    }
}