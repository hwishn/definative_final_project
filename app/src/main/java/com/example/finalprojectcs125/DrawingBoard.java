package com.example.finalprojectcs125;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingBoard extends AppCompatActivity {
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_board);
        Button pencil = findViewById(R.id.pencil_btn);
        Button color = findViewById(R.id.color_btn);
        Button clear = findViewById(R.id.clear_btn);
        pencil.setOnClickListener(u -> System.out.println("Pencil button was clicked"));
        color.setOnClickListener(u -> System.out.println("color button was clicked"));
        clear.setOnClickListener(u -> System.out.println("clear button was clicked"));
    }
}
