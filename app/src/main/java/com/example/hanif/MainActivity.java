package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {
CardView cardView,arts,kobitaclass,banglacl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView=findViewById(R.id.firstlearn);
        arts=findViewById(R.id.artsID);
        kobitaclass=findViewById(R.id.kobitaid);
        banglacl=findViewById(R.id.banglaID);

        banglacl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bann=new Intent(MainActivity.this,BanglaActivity.class);
                startActivity(bann);
            }
        });

        kobitaclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kobi=new Intent(MainActivity.this,KobitaMainActivity.class);
                startActivity(kobi);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Home_main.class);
                startActivity(intent);

            }
        });

        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rohan=new Intent(MainActivity.this,ArtActivity.class);
                startActivity(rohan);
            }
        });

    }
}