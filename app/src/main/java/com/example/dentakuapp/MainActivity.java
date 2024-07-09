package com.example.dentakuapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView inputText;
    private AppCompatButton inputAppCompatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputText = findViewById(R.id.input);
        inputText = findViewById(R.id.output);

        inputAppCompatButton = findViewById(R.id.bottom_clear);
        inputAppCompatButton = findViewById(R.id.bottom_bracket_left);
        inputAppCompatButton = findViewById(R.id.bottom_bracket_right);
        inputAppCompatButton = findViewById(R.id.bottom_division);
        inputAppCompatButton = findViewById(R.id.bottom_7);
        inputAppCompatButton = findViewById(R.id.bottom_8);
        inputAppCompatButton = findViewById(R.id.bottom_9);
        inputAppCompatButton = findViewById(R.id.bottom_multiply);
        inputAppCompatButton = findViewById(R.id.bottom_4);
        inputAppCompatButton = findViewById(R.id.bottom_5);
        inputAppCompatButton = findViewById(R.id.bottom_6);
        inputAppCompatButton = findViewById(R.id.bottom_subtraction);
        inputAppCompatButton = findViewById(R.id.bottom_1);
        inputAppCompatButton = findViewById(R.id.bottom_2);
        inputAppCompatButton = findViewById(R.id.bottom_3);
        inputAppCompatButton = findViewById(R.id.bottom_addition);
        inputAppCompatButton = findViewById(R.id.bottom_0);
        inputAppCompatButton = findViewById(R.id.bottom_dot);
        inputAppCompatButton = findViewById(R.id.bottom_equals);

    }
}

//package com.example.dentakuapp;
//
//import android.os.Bundle;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
//}