package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AyayChadActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayay_chad);
        button=findViewById(R.id.buttononeID);
        textToSpeech=new TextToSpeech(AyayChadActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "আয় আয় চাঁদ মামা\n" +
                                "টিপ দিয়ে যা,\n" +
                                "চাঁদের কপালে চাঁদ\n" +
                                "টিপ দিয়ে যা।\n" +
                                "মাছ কাঁটলে মুড়ো দিব,\n" +
                                "ধান ভাংলে কুড়ো দিব,\n" +
                                "কালো গরুর দুধ দিব,\n" +
                                "দুধ খাবার বাটি দিব\n" +
                                "চাঁদের কপালে চাঁদ\n" +
                                "টিপ দিয়ে যা।",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(AyayChadActivity.this,"Play",Toast.LENGTH_SHORT).show();
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