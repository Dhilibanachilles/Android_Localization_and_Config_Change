package com.example.androidbasics2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    TextView textViewCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCounter = findViewById(R.id.txt_count);
        if(savedInstanceState != null) {
            counter = savedInstanceState.getInt("score");
            textViewCounter.setText(String.valueOf(counter));
        }
    }

    public void onIncrementButtonClick(View view) {
        counter ++;
        textViewCounter.setText(String.valueOf(counter));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score", counter);
    }
}