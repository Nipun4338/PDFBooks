package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class shonkhoread extends AppCompatActivity {

    PDFView read;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shonkhoread);

        read=(PDFView) findViewById(R.id.shonkhonilread);
        read.fromAsset("shonkhoneel_karagar.pdf").load();

    }
}
