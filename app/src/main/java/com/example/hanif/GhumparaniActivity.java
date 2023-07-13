package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GhumparaniActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghumparani);
        button=findViewById(R.id.buttononeID);

        textToSpeech=new TextToSpeech(GhumparaniActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "ঘুমপাড়ানী মাসি পিসি,\n" +
                                "মোদের বাড়ি এসো।\n" +
                                "খাট নাই পালং নাই,\n" +
                                "চোখ পেতে বোসো।",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(GhumparaniActivity.this,"Play",Toast.LENGTH_SHORT).show();
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