package com.example.loader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import com.agrawalsuneet.dotsloader.loaders.CircularDotsLoader;
import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircularDotsLoader loader = findViewById(R.id.loder);
        loader.setDefaultColor(ContextCompat.getColor(this,R.color.purple_700));
        loader.setSelectedColor(ContextCompat.getColor(this,R.color.purple_500));
        loader.setShowRunningShadow(true);
        loader.setFirstShadowColor(ContextCompat.getColor(this, R.color.purple_700));
        loader.setSecondShadowColor(ContextCompat.getColor(this, R.color.purple_500));

    }
}