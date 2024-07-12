package com.example.dentakuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private TextView inputText;

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

        findViewById(R.id.bottom_clear).setOnClickListener(buttonListener);
        findViewById(R.id.bottom_bracket_left).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.bottom_bracket_right).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.bottom_division).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.bottom_7).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_8).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_9).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_multiply).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.bottom_4).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_5).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_6).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_subtraction).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.bottom_1).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_2).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_3).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_addition).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.bottom_0).setOnClickListener(buttonNumberListener);
        findViewById(R.id.bottom_dot).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.bottom_equals).setOnClickListener(buttonOperatorListener);

    }
    View.OnClickListener buttonNumberListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    View.OnClickListener buttonOperatorListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
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