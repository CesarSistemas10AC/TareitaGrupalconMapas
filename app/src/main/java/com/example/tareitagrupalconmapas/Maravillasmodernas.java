package com.example.tareitagrupalconmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Maravillasmodernas extends AppCompatActivity {

    ImageButton imgbtnCristo, imgbtnMachupicchu, imgbtnTajmahal, imgbtnMuralla, imgbtnChichenitza, imgbtnColiseo, imgbtnPetra;
    Button btnmodernas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maravillasmodernas);

        imgbtnCristo = (ImageButton) findViewById(R.id.imgbtcristo);
        imgbtnCristo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Cristoredentor.class);
                startActivity(intent);
            }
        });

        imgbtnMachupicchu = (ImageButton) findViewById(R.id.imgbtmachupicchu);
        imgbtnMachupicchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Machupicchu.class);
                startActivity(intent);
            }
        });

        imgbtnTajmahal = (ImageButton) findViewById(R.id.imgbttajmahal);
        imgbtnTajmahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),tajmahal.class);
                startActivity(intent);
            }
        });

        imgbtnMuralla = (ImageButton) findViewById(R.id.imgbtmurallachina);
        imgbtnMuralla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Murallachina.class);
                startActivity(intent);
            }
        });

        imgbtnChichenitza = (ImageButton) findViewById(R.id.imgbt5piramidechichenitza);
        imgbtnChichenitza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Chichenitza.class);
                startActivity(intent);
            }
        });

        imgbtnColiseo = (ImageButton) findViewById(R.id.imgbtcoliseo);
        imgbtnColiseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Coliseoromano.class);
                startActivity(intent);
            }
        });

        imgbtnPetra = (ImageButton) findViewById(R.id.imgbtpetra);
        imgbtnPetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CiudaddePetra.class);
                startActivity(intent);
            }
        });

        btnmodernas = (Button) findViewById(R.id.btnMaravillasModernas);
        btnmodernas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MapsActivityGoModernas.class);
                startActivity(intent);
            }
        });
    }
}