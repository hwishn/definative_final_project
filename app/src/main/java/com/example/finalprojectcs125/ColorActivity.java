package com.example.finalprojectcs125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        Button red = findViewById(R.id.red_btn);
        Button blue = findViewById(R.id.blue_btn);
        Button green = findViewById(R.id.green_btn);
        Button yellow = findViewById(R.id.yellow_btn);
        Button purple = findViewById(R.id.purple_btn);
        Button orange = findViewById(R.id.orange_btn);
        red.setOnClickListener(u -> System.out.println("Red button was clicked"));
        blue.setOnClickListener(u -> System.out.println("Blue button was clicked"));
        green.setOnClickListener(u -> System.out.println("Green button was clicked"));
        yellow.setOnClickListener(u -> System.out.println("Yellow button was clicked"));
        purple.setOnClickListener(u -> System.out.println("Purple button was clicked"));
        orange.setOnClickListener(u -> System.out.println("Orange button was clicked"));
    }
}
