package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
CardView zero,onee,two,three,four,five,six,seven,eight,nine,ten;
TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        zero=findViewById(R.id.ZeroID);
        onee=findViewById(R.id.oneId);
        two=findViewById(R.id.twoID);
        three=findViewById(R.id.threeID);
        four=findViewById(R.id.fourID);
        five=findViewById(R.id.fiveID);
        six=findViewById(R.id.sixID);
        seven=findViewById(R.id.sevenID);
        eight=findViewById(R.id.eightID);
        nine=findViewById(R.id.nineID);
        ten=findViewById(R.id.tenID);

        textToSpeech=new TextToSpeech(MainActivity2.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("zero",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        onee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("one",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("two",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("three",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("four",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("five",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("six",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("seven",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("eight",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("nine",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ten",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
    }
}