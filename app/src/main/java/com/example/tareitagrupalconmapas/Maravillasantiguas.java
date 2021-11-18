package com.example.tareitagrupalconmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Maravillasantiguas extends AppCompatActivity {

    ImageButton imgbtnColoso, imgbtnFaro, imgbtnZeus, imgbtnJardines, imgbtnMausoleo, imgbtnTemplo, imgbtnPirámide;
    Button btnAntiguas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maravillasantiguas);

        imgbtnColoso = (ImageButton) findViewById(R.id.imgbtncoloso);
        imgbtnColoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Colosoderodas.class);
                startActivity(intent);
            }
        });

        imgbtnFaro = (ImageButton) findViewById(R.id.imgbtnfaro);
        imgbtnFaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FarodeAlejandria.class);
                startActivity(intent);
            }
        });

        imgbtnZeus = (ImageButton) findViewById(R.id.imgbtnzeus);
        imgbtnZeus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),EstatuadeZeus.class);
                startActivity(intent);
            }
        });

        imgbtnJardines = (ImageButton) findViewById(R.id.imgbtnjardines);
        imgbtnJardines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JardinesdeBabilonia.class);
                startActivity(intent);
            }
        });

        imgbtnMausoleo = (ImageButton) findViewById(R.id.imgbtnmausoleo);
        imgbtnMausoleo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mausoleo.class);
                startActivity(intent);
            }
        });

        imgbtnTemplo = (ImageButton) findViewById(R.id.imgbtntemplo);
        imgbtnTemplo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TemplodeArtemiza.class);
                startActivity(intent);
            }
        });

        imgbtnPirámide = (ImageButton) findViewById(R.id.imgbtnpiramidegiza);
        imgbtnPirámide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PiramidedeGiza.class);
                startActivity(intent);
            }
        });

        btnAntiguas = (Button) findViewById(R.id.btnMaravillasAntiguas);
        btnAntiguas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MapsActivityGoAntiguas.class);
                startActivity(intent);
            }
        });
    }
}