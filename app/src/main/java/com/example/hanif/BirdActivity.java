package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class BirdActivity extends AppCompatActivity {
CardView dove,canary ,crow ,duck ,eagle ,hoopoe, hornbill, kingfisher,
        lapwing, nightingale, parrot ,peacock;
TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        dove=findViewById(R.id.doveID);
        canary=findViewById(R.id.canaryID);
        duck=findViewById(R.id.duckID);
        crow=findViewById(R.id.crowID);
        eagle=findViewById(R.id.eagleID);
        hoopoe=findViewById(R.id.hoopoeID);
        hornbill=findViewById(R.id.hornbillID);
        kingfisher=findViewById(R.id.kingfisherID);
        lapwing=findViewById(R.id.lapwingID);
        nightingale=findViewById(R.id.nightingaleID);
        parrot=findViewById(R.id.parrotID);
        peacock=findViewById(R.id.peacockID);


        textToSpeech=new TextToSpeech(BirdActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        dove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ঘুঘু",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });

        duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("পাতিহাঁস",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        canary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ক্যানারি পাখি",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        crow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("কাক",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        eagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("egol",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        hoopoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("হুপ পাখি",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        hornbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("হর্নবিল পাখি",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        kingfisher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("মাছরাঙ্গা",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        lapwing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("mynah পাখি",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        nightingale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("পাপিয়া পাখি ",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        parrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("টিয়া পাখি",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        peacock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("pecha",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });








    }
}