package com.example.tareitagrupalconmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY = 5000;
    Animation animation,btn1;
    ImageView imgvw;
    TextView letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        animation = AnimationUtils.loadAnimation(this, R.anim.top);
        btn1 = AnimationUtils.loadAnimation(this, R.anim.button);
        imgvw = findViewById(R.id.Imgvw1);
        letra = findViewById(R.id.txtView2);
        imgvw.setAnimation(animation);
        letra.setAnimation(btn1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
                }
        },SPLASH_SCREEN_DELAY);
    }
}