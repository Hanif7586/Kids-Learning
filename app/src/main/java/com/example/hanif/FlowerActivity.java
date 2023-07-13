package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class FlowerActivity extends AppCompatActivity {
CardView aster ,birdsId ,lily,bougainvillea ,buttercup, calendula, daffodil ,dahlia ,flower ,
    angel, rose, water_lily;
TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        aster=findViewById(R.id.aster);
        birdsId=findViewById(R.id.birdsId);
        bougainvillea=findViewById(R.id.bougainvillea);
        buttercup=findViewById(R.id.buttercup);
        calendula=findViewById(R.id.calendula);
        daffodil=findViewById(R.id.daffodil);
        dahlia=findViewById(R.id.dahlia);
        flower=findViewById(R.id.flower);
        angel=findViewById(R.id.angel);
        rose=findViewById(R.id.rose);
        water_lily=findViewById(R.id.water_lily);
        lily=findViewById(R.id.lily);


        textToSpeech=new TextToSpeech(FlowerActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        aster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("তারাফুল",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        birdsId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Rose",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        bougainvillea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("বোগেনভিলিয়া",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        buttercup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ঝুমকো লতা",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        calendula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ক্যালেন্ডুলা",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        daffodil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("হলদে ফুল",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        dahlia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ডালিয়া",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Grass ful",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Surjomukhi",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        angel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "Dhrubo Tara",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("tulips ful",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        water_lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("sapla",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });




    }
}