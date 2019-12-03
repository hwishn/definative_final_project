package com.example.finalprojectcs125;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        Button start = findViewById(R.id.start_btn);
        start.setOnClickListener(unused -> System.out.println("start button was pressed"));
    }

}
