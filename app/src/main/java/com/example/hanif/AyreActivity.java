package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AyreActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayre);
        button=findViewById(R.id.buttononeID);

        textToSpeech=new TextToSpeech(AyreActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "আয় রে আয় টিয়ে\n" +
                                "নায়ে ভরা দিয়ে\n" +
                                "না’ নিয়ে গেল বোয়াল মাছে\n" +
                                "তাই না দেখে ভোঁদড় নাচে\n" +
                                "ওরে ভোঁদড় ফিরে চা\n" +
                                "খোকার নাচন দেখে যা।",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(AyreActivity.this,"Play",Toast.LENGTH_SHORT).show();
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