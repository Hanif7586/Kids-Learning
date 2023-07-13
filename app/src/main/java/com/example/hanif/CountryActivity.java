package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class CountryActivity extends AppCompatActivity {
CardView argentina,Austria, Germanyy ,Brazil ,Cambodia ,Canada ,Croatia, Cuba, Denmark, France,
            Germany ,Bangladesh, India ,Monaco;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        argentina=findViewById(R.id.argentina);
        Austria=findViewById(R.id.Austria);
        Germanyy=findViewById(R.id.Germanyy);
        Brazil=findViewById(R.id.Brazil);
        Cambodia=findViewById(R.id.Cambodia);
        Canada=findViewById(R.id.Canada);
        Croatia=findViewById(R.id.Croatia);
        Cuba=findViewById(R.id.Cuba);
        Denmark=findViewById(R.id.Denmark);
        France=findViewById(R.id.France);
        Germany=findViewById(R.id.Germany);
        Bangladesh=findViewById(R.id.Bangladesh);
        India=findViewById(R.id.India);
        Monaco=findViewById(R.id.Monaco);



        textToSpeech=new TextToSpeech(CountryActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        argentina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("argentina",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Austria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Austria",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Germanyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Germanyy",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Brazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Brazil",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Cambodia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Cambodia",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Canada",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Croatia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Croatia",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Cuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Cuba",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Denmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Denmark",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        France.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("France",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });

        Germany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Germany",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Bangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Bangladesh",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        India.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("India",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        Monaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Monaco",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });

    }
}