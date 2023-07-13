package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class JemitiActivity extends AppCompatActivity {
TextToSpeech textToSpeech;
CardView cone,cube ,cuboid ,cylinder ,diamond ,moon, oval ,parallelogram,
    pyramid, rectangle, rhombus, sphere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jemiti);

        cone=findViewById(R.id.cone);
        cube=findViewById(R.id.cube);
        cuboid=findViewById(R.id.cuboid);
        cylinder=findViewById(R.id.cylinder);
        diamond=findViewById(R.id.diamond);
        moon=findViewById(R.id.moon);
        oval=findViewById(R.id.oval);
        parallelogram=findViewById(R.id.parallelogram);
        pyramid=findViewById(R.id.pyramid);
        rectangle=findViewById(R.id.rectangle);
        rhombus=findViewById(R.id.rhombus);
        sphere=findViewById(R.id.sphere);





        textToSpeech=new TextToSpeech(JemitiActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("cone",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("cube",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        cuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("cubo",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("cylinder",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("diamond",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("moon",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        oval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("oval",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        parallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("parallelogram",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        pyramid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("pyramid",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("rectangle",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        rhombus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("rhombus",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("sphere",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });



    }
}