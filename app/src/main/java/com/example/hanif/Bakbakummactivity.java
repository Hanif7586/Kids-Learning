package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Bakbakummactivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakbakummactivity);

        button=findViewById(R.id.buttononeID);
        textToSpeech=new TextToSpeech(Bakbakummactivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "বাক বাক্কুম পায়রা\n" +
                                "মাথায় দিয়ে টায়রা\n" +
                                "বউ সাজবে কাল কি\n" +
                                "চড়বে সোনার পালকি।",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(Bakbakummactivity.this,"Play",Toast.LENGTH_SHORT).show();
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