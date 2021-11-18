package com.example.tareitagrupalconmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnmodernas,btncusco,btnantiguas,btnRuta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmodernas = (Button)findViewById(R.id.btnMmodernas);
        btnmodernas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Maravillasmodernas.class);
                startActivity(intent);
            }
        });
        btncusco = (Button)findViewById(R.id.btnCusco);
        btncusco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),TuristeaCusco.class);
                startActivity(intent);
            }
        });
        btnantiguas = (Button)findViewById(R.id.btnMantiguas);
        btnantiguas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Maravillasantiguas.class);
                startActivity(intent);
            }
        });

        btnRuta = (Button) findViewById(R.id.btnruta);
        btnRuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}