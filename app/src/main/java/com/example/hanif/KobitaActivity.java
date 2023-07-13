package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class KobitaActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobita);

        button=findViewById(R.id.buttononeID);

        textToSpeech=new TextToSpeech(KobitaActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "আম পাতা জোড়া-জোড়া,\n" +
                        "মারবো চাবুক চড়বো ঘোড়া।\n" +
                        "ওরে বুবু সরে দাঁড়া,\n" +
                        "আসছে আমার পাগলা ঘোড়া।\n" +
                        "পাগলা ঘোড়া ক্ষেপেছে,\n" +
                        "চাবুক ছুঁড়ে মেরেছে।",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(KobitaActivity.this,"Play",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onDestroy() {
        if (textToSpeech!=null && textToSpeech.isSpeaking()){
            textToSpeech.stop();
            textToSpeech.isSpeaking();
            textToSpeech=null;
        }
        super.onDestroy();
    }
}