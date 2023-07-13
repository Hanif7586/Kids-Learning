package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LotonActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loton);
        button=findViewById(R.id.buttononeID);

        textToSpeech=new TextToSpeech(LotonActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "নোটন নোটন পায়রাগুলি\n" +
                                "ঝোটন বেঁধেছে,\n" +
                                "ওপারেতে ছেলেমেয়ে\n" +
                                "নাইতে নেমেছে।\n" +
                                "দুই ধারে দুই রুই কাতলা\n" +
                                "ভেসে উঠেছে,\n" +
                                "কে দেখেছে কে দেখেছে\\n" +
                                "দাদা দেখেছে।\n" +
                                "দাদার হাতে কলম ছিল\n" +
                                "ছুড়ে মেরেছে,\n" +
                                "উঃ বড্ড লেগেছে।",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(LotonActivity.this,"Play",Toast.LENGTH_SHORT).show();
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