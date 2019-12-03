package com.example.finalprojectcs125;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingBoard extends AppCompatActivity {
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_board);
        Button pencil = findViewById(R.id.pencil_btn);
        Button color = findViewById(R.id.color_btn);
        Button clear = findViewById(R.id.clear_btn);
        pencil.setOnClickListener(u -> System.out.println("Pencil button was clicked"));
        color.setOnClickListener(u -> {
            Intent intent = new Intent(this, ColorActivity.class);
            startActivity(intent);
            finish();
        });
        clear.setOnClickListener(u -> System.out.println("clear button was clicked"));
        ImageView canvas = findViewById(R.id.Canvas);
        canvas.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                //to implement laster
                return true;
            }
        });

    }
}
