package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class MonthActivity extends AppCompatActivity {
CardView january,feb,marc,april,may,june,july,agus,septombor,octo,novem,decombor;
TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        january=findViewById(R.id.januaryID);
        feb=findViewById(R.id.February);
        marc=findViewById(R.id.March);
        april=findViewById(R.id.april);
        may=findViewById(R.id.May);
        june=findViewById(R.id.june);
        july=findViewById(R.id.julay);
        agus=findViewById(R.id.agust);
        septombor=findViewById(R.id.septembor);
        octo=findViewById(R.id.octobor);
        novem=findViewById(R.id.novembor);
        decombor=findViewById(R.id.decombor);



        textToSpeech=new TextToSpeech(MonthActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        january.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("january",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        feb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("February",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        marc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("March",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        april.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("April",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        may.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("May",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        june.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("June",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        july.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("July",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        agus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("August",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        septombor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("September",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        octo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("October",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        novem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("November",TextToSpeech.QUEUE_FLUSH,null,null);

            }
        });
        decombor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("December",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });



    }
}