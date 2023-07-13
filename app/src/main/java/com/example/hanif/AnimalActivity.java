package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class AnimalActivity extends AppCompatActivity {
TextToSpeech textToSpeech;
CardView cheetah ,chipmuck,chipmuckh, deer, elephant ,fox ,giraffe ,gorilla,
    hyena, kangaroo,
            lion ,monkey, panda, tiger, wolf ,zebra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);


        cheetah=findViewById(R.id.cheetah);
        chipmuck=findViewById(R.id.chipmuck);
        chipmuckh=findViewById(R.id.chipmuckh);
        deer=findViewById(R.id.deer);
        elephant=findViewById(R.id.elephant);
        fox=findViewById(R.id.fox);
        giraffe=findViewById(R.id.giraffe);
        gorilla=findViewById(R.id.gorilla);
        hyena=findViewById(R.id.hyena);
        kangaroo=findViewById(R.id.kangaroo);
        lion=findViewById(R.id.lion);
        monkey=findViewById(R.id.monkey);
        panda=findViewById(R.id.panda);
        tiger=findViewById(R.id.tiger);
        wolf=findViewById(R.id.wolf);
        zebra=findViewById(R.id.zebra);





        textToSpeech=new TextToSpeech(AnimalActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        cheetah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("cheetah",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        chipmuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Kangaru",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        chipmuckh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("chipmuckh",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        deer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("deer",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("elephant",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("fox",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        giraffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("giraffe",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });



        gorilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("gorilla",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        hyena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("hyena",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        kangaroo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("kangaroo",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("lion",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("monkey",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        panda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("panda",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("tiger",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        wolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("wolf",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });

        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("zebra",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });




    }
}