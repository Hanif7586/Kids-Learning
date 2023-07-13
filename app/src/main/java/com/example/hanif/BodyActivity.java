package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

public class BodyActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    CardView chestid,earid ,elbowid ,eyeid ,footid ,footprintid ,hairid, handid ,kneeid
        ,likeid,lipsid,mouthid,neckid,noseid,runningid ,shoulderid , stomachid  ,thighs  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);

        chestid=findViewById(R.id.chestid);
        earid=findViewById(R.id.earid);
        elbowid=findViewById(R.id.elbowid);
        eyeid=findViewById(R.id.eyeid);
        footid=findViewById(R.id.footid);
        footprintid=findViewById(R.id.footprintid);
        hairid=findViewById(R.id.hairid);
        handid=findViewById(R.id.handid);
        kneeid=findViewById(R.id.kneeid);
        likeid=findViewById(R.id.likeid);
        lipsid=findViewById(R.id.lipsid);
        mouthid=findViewById(R.id.mouthid);
        neckid=findViewById(R.id.neckid);
        noseid=findViewById(R.id.noseid);
        runningid=findViewById(R.id.runningid);
        shoulderid=findViewById(R.id.shoulderid);
        stomachid=findViewById(R.id.stomachid);
        thighs=findViewById(R.id.thighs);


        textToSpeech=new TextToSpeech(BodyActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        chestid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("chest",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });

        earid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("ear",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });

        elbowid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("elbo",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        eyeid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("eye",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        footid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("foot",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        footprintid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(" footprint",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        hairid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("  hair",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        handid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("hand",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        kneeid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("knee",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        likeid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(
                        "fingers",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        lipsid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("lips ",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        mouthid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("mouth",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        neckid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(" neck",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });

        noseid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(" nose",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        runningid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("the waist",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        shoulderid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("shoulder",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        stomachid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("stomach",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        thighs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("thighs",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });









    }
}