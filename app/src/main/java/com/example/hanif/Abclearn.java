package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Abclearn extends AppCompatActivity {
CardView aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt,uu,vv,ww,xx,yy,zz;
    TextToSpeech textToSpeech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abclearn);



        zz=findViewById(R.id.zzz);
        aa=findViewById(R.id.a);
        bb=findViewById(R.id.b);
        cc=findViewById(R.id.c);
        dd=findViewById(R.id.d);
        ee=findViewById(R.id.e);
        ff=findViewById(R.id.f);
        gg=findViewById(R.id.g);
        hh=findViewById(R.id.h);
        ii=findViewById(R.id.i);
        jj=findViewById(R.id.j);
        kk=findViewById(R.id.k);
        ll=findViewById(R.id.l);
        mm=findViewById(R.id.m);
        nn=findViewById(R.id.n);
        oo=findViewById(R.id.o);
        pp=findViewById(R.id.p);
        qq=findViewById(R.id.q);
        rr=findViewById(R.id.r);
        ss=findViewById(R.id.s);
        tt=findViewById(R.id.t);
        uu=findViewById(R.id.u);
        vv=findViewById(R.id.v);
        ww=findViewById(R.id.w);
        xx=findViewById(R.id.x);
        yy=findViewById(R.id.y);






        textToSpeech=new TextToSpeech(Abclearn.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }
        });

        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("A",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("B",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("c",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("d",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("e",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("f",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("g",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("h",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("i",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        jj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("j",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("k",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("l",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("m",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("n",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("o",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("p",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        qq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("q",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("r",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("s",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("t",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        uu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("u",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("v",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        ww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("w",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("x",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        yy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("y",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });
        zz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak("Zed",TextToSpeech.QUEUE_FLUSH,null,null);


            }
        });



    }
}