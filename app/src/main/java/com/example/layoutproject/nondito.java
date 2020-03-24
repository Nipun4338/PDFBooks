package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class nondito extends AppCompatActivity {
    PDFView read;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nondito);

        read=(PDFView) findViewById(R.id.nondito);
        read.fromAsset("Nandito_Noroke.pdf").load();
    }
}
