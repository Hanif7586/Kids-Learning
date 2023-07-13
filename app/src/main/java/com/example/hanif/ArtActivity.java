package com.example.hanif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.kyanogen.signatureview.SignatureView;

import java.io.File;
import java.security.Signature;

public class ArtActivity extends AppCompatActivity {
SignatureView signatureView;
ImageButton imageEraser,colorpencile;
SeekBar seekBar;
TextView textPenSize;

private static String fileName;
File path=new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/myPainting");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        signatureView=findViewById(R.id.signature_view);
        seekBar=findViewById(R.id.penSize);
        textPenSize=findViewById(R.id.textPenSize);
        imageEraser=findViewById(R.id.btnEraser);
        colorpencile=findViewById(R.id.btnpencile);



        imageEraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signatureView.clearCanvas();
            }
        });

seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        textPenSize.setText(i + "dp");
        signatureView.setPenSize(i);
        seekBar.setMax(50);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});

colorpencile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(ArtActivity.this,"ART Korun",Toast.LENGTH_SHORT).show();
    }
});

    }
}