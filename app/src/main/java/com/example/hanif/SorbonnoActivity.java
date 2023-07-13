package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

public class SorbonnoActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
   CardView soroyo ,soreya, hassoi, dirgoi ,husuou ,
           dirgeu, hasorii ,aaaaa ,oii, oooo, ouu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorbonno);

        soroyo=findViewById(R.id.soroyo);
        soreya=findViewById(R.id.soreya);
        hassoi=findViewById(R.id.hassoi);
        dirgoi=findViewById(R.id.dirgoi);
        husuou=findViewById(R.id.husuou);
        dirgeu=findViewById(R.id.dirgeu);
        hasorii=findViewById(R.id.hasorii);
        aaaaa=findViewById(R.id.aaaaa);
        oii=findViewById(R.id.oii);
        oooo=findViewById(R.id.oooo);
        ouu=findViewById(R.id.ouu);

        textToSpeech=new TextToSpeech(SorbonnoActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        soroyo .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("soroyo",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        soreya .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("soreya",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        hassoi .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("hasoi",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        dirgoi .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("dirgoi",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        husuou .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("hosou",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        dirgeu .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("dirgou",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        hasorii .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("hasori",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        aaaaa .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("a",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        oii .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("oi",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        oooo .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("o",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ouu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ওউ",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });


    }
}