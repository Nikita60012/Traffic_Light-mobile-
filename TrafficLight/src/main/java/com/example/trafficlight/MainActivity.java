package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private Button button_red;
    private Button button_yellow;
    private Button button_green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layout = findViewById(R.id.layout);
        button_red = findViewById(R.id.button_red);
        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = Color.RED;
                layout.setBackgroundColor(color);
            }
        });
        button_yellow = findViewById(R.id.button_yellow);
        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = Color.argb(100,228,186,26);
                layout.setBackgroundColor(color);
            }
        });
        button_green = findViewById(R.id.button_green);
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = Color.argb(100,69,161,2);
                layout.setBackgroundColor(color);
            }
        });
    }
}