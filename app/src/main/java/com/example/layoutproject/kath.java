package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kath extends AppCompatActivity {
    PDFView read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kath);

        read=(PDFView) findViewById(R.id.kath);
        read.fromAsset("Kathpencil.pdf").load();
    }
}
