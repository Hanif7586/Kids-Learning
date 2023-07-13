package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BanglaActivity extends AppCompatActivity {
CardView sorbonno,banjonbonno;
Button button,buttonn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);


        sorbonno=findViewById(R.id.sorbonnoid);
        button=findViewById(R.id.sorID);
        buttonn=findViewById(R.id.banjonIDd);
        banjonbonno=findViewById(R.id.bangonbonnoID);


        sorbonno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BanglaActivity.this,SorbonnoActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BanglaActivity.this,SorbonnoActivity.class);
                startActivity(intent);
            }
        });
        banjonbonno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aaaa=new Intent(BanglaActivity.this,BanjonbonnoActivity.class);
                startActivity(aaaa);
            }
        });
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aaaa=new Intent(BanglaActivity.this,BanjonbonnoActivity.class);
                startActivity(aaaa);
            }
        });

    }
}