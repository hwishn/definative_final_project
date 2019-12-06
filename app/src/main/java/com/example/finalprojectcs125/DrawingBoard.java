package com.example.finalprojectcs125;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Path;

public class DrawingBoard extends AppCompatActivity {
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_board);
        PaintView drawer = findViewById(R.id.drawing_thing);
        System.out.println(drawer);
        Button red = findViewById(R.id.red_btn2);
        Button blue = findViewById(R.id.blue_btn2);
        Button green = findViewById(R.id.green_btn2);
        Button yellow = findViewById(R.id.yellow_btn2);
        Button purple = findViewById(R.id.purple_btn2);
        Button orange = findViewById(R.id.orange_btn2);
        red.setOnClickListener(u -> {
            drawer.setColor(Color.RED);
        });
        blue.setOnClickListener(u -> {
            drawer.setColor(Color.BLUE);
        });
        green.setOnClickListener(u -> {
            drawer.setColor(Color.GREEN);
        });
        yellow.setOnClickListener(u -> {
            drawer.setColor(Color.YELLOW);
        });
        purple.setOnClickListener(u -> {
            drawer.setColor(Color.rgb(238,130,238));
        });
        orange.setOnClickListener(u -> {
            drawer.setColor(Color.rgb(255,165,0));
        });

        Button clear = findViewById(R.id.clear_btn);
        clear.setOnClickListener(u -> System.out.println("clear button was clicked"));
    }

    static class FingerPath {
        int color;
        int strokeWidth;
        Path path;
        public FingerPath(int num, int width, Path input) {
            color = num;
            strokeWidth = width;
            path = input;
        }
    }
}
