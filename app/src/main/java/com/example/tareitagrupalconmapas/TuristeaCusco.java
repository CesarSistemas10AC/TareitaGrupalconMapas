package com.example.tareitagrupalconmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TuristeaCusco extends AppCompatActivity {

    ImageButton imgbtnArtesania, imgbtnMachupicchu, imgbtnPlaza, imgbtnMoray, imgbtnSaqsaywaman;
    Button btnMapacusco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turistea_cusco);

        imgbtnArtesania = (ImageButton) findViewById(R.id.imbtartesania);
        imgbtnArtesania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Artesania.class);
                startActivity(intent);
            }
        });

        imgbtnMachupicchu = (ImageButton) findViewById(R.id.imbtmachu);
        imgbtnMachupicchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Machupicchu.class);
                startActivity(intent);
            }
        });

        imgbtnPlaza = (ImageButton) findViewById(R.id.imbtplaza);
        imgbtnPlaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Plazadearmas.class);
                startActivity(intent);
            }
        });

        imgbtnMoray = (ImageButton) findViewById(R.id.imbtmoray);
        imgbtnMoray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Moray.class);
                startActivity(intent);
            }
        });

        imgbtnSaqsaywaman = (ImageButton) findViewById(R.id.imbtsaqsaywaman);
        imgbtnSaqsaywaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Saqsaywaman.class);
                startActivity(intent);
            }
        });

        btnMapacusco = (Button) findViewById(R.id.btnCuscomapa);
        btnMapacusco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MapsActivityGo.class);
                startActivity(intent);
            }
        });
    }
}