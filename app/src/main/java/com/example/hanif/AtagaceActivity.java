package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AtagaceActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    TextView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atagace);
        button=findViewById(R.id.buttononeID);

        textToSpeech=new TextToSpeech(AtagaceActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "আতা গাছে তোতা পাখি\n" +
                                "ডালিম গাছে মউ,\n" +
                                "কথা কও না কেন বউ \n" +
                                "কথা কব কী ছলে,\n" +
                                "কথা কইতে গা জ্বলে",TextToSpeech.QUEUE_FLUSH,null,null);


                Toast.makeText(AtagaceActivity.this,"Play",Toast.LENGTH_SHORT).show();
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