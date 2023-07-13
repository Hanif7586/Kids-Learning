package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HattitActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hattit);
        button=findViewById(R.id.buttononeID);
        textToSpeech=new TextToSpeech(HattitActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "হাট্টিমা টিম টিম—\n" +
                                "তারা মাঠে পাড়ে ডিম\n" +
                                "তাদের খাড়া দুটো শিং\n" +
                                "তারা হাট্টিমা টিম টিম।",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(HattitActivity.this,"Play",Toast.LENGTH_SHORT).show();
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