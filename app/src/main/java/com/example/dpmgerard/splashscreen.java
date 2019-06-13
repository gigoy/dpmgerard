package com.example.dpmgerard;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {

    private AlphaAnimation fading;
    private ImageView winteclogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        fading = new AlphaAnimation(0.0f,1.0f);
        winteclogo = findViewById(R.id.imageView_wintecLogo);

        winteclogo.startAnimation(fading);
        fading.setDuration(3000);
        fading.setFillAfter(true);


        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            }
        }.start();


    }
}
