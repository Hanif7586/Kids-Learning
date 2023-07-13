package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home_main extends AppCompatActivity {
CardView alpha,num,bird,body,country,day,month,flower,jemiti,animalcl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);

        alpha=findViewById(R.id.alphabet);
        num=findViewById(R.id.numberD);
        bird=findViewById(R.id.birdsId);
        body=findViewById(R.id.bodyId);
        country=findViewById(R.id.countryID);
        day=findViewById(R.id.dayID);
        month=findViewById(R.id.monthID);
        flower=findViewById(R.id.flowerID);
        jemiti=findViewById(R.id.jemitiid);
        animalcl=findViewById(R.id.animalID);


        animalcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aniii=new Intent(Home_main.this,AnimalActivity.class);
                startActivity(aniii);
            }
        });

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home_main.this,Abclearn.class);
                startActivity(intent);
            }
        });

        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent(Home_main.this,MainActivity2.class);
                startActivity(inten);
            }
        });

        bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent birdd=new Intent(Home_main.this,BirdActivity.class);
                startActivity(birdd);
            }
        });
        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bodypart=new Intent(Home_main.this,BodyActivity.class);
                startActivity(bodypart);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent countryy=new Intent(Home_main.this,CountryActivity.class);
                startActivity(countryy);
            }
        });
        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dayy=new Intent(Home_main.this,DayActivity.class);
                startActivity(dayy);
            }
        });
        month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mas=new Intent(Home_main.this,MonthActivity.class);
                startActivity(mas);
            }
        });

        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent flo=new Intent(Home_main.this,FlowerActivity.class);
                startActivity(flo);
            }
        });
        jemiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jemi=new Intent(Home_main.this,JemitiActivity.class);
                startActivity(jemi);
            }
        });



    }
}