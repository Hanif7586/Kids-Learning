package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ChaduteceActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chadutece);
        button=findViewById(R.id.buttononeID);

        textToSpeech=new TextToSpeech(ChaduteceActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "চাঁদ উঠেছে ফুল ফুঁটেছে , কদম তলায় কে \n" +
                                "হাতি নাচছে ঘোড়া নাচছে , সোনামনির বে \n" +
                                "চাঁদ উঠেছে ফুল ফুঁটেছে , কদম তলায় কে \n" +
                                "হাতি নাচছে ঘোড়া নাচছে , সোনামনির বে \n",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(ChaduteceActivity.this,"Play",Toast.LENGTH_SHORT).show();
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