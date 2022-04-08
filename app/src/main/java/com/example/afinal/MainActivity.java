package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///flip img
        ViewFlipper VF = findViewById(R.id.view_flipper);
        VF.setInAnimation(MainActivity.this, android.R.anim.fade_in);
        VF.showNext();
        VF.setFlipInterval(5000);
        VF.startFlipping();


    }
}