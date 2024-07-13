package com.example.dentakuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;


public class MainActivity extends AppCompatActivity {

    private TextView inputText;
    private TextView outputText;
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
        outputText = findViewById(R.id.output);

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
        findViewById(R.id.bottom_equals).setOnClickListener(ButtonEqualsListener);

    }
    View.OnClickListener buttonNumberListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String num = ((AppCompatButton)view).getText().toString();
            //＋などの記号が押されていたらまたは数字が先頭が0なら0と押したボタンの数字を置き換え
            String result = addToInputText(num);
            inputText.setText(result);
        }
    };
    View.OnClickListener buttonOperatorListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String operator = ((AppCompatButton)view).getText().toString();
            //計算するメソッド呼び出し

            String result = addToInputText(operator);
            inputText.setText(result);
        }
    };
    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            inputText.setText("");
            outputText.setText("");
        }
    };

    View.OnClickListener ButtonEqualsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showResult();
        }
    };
    //計算するメソッド
    private String addToInputText(String num) {
        String inputTextStr = inputText.getText().toString();
        return inputTextStr + num;
    };

    private String getInputExpression(){
        String expression = inputText.getText().toString().replace("÷","/");
        expression = expression.replace("×","*");
        return expression;
    }
    private void showResult(){
        String expression = getInputExpression();
        Calculable calc = null;
        try {
            calc = new ExpressionBuilder(expression).build();
            double result = calc.calculate();
            outputText.setText(String.valueOf((int) result));
        } catch (UnknownFunctionException e) {
            throw new RuntimeException(e);
        } catch (UnparsableExpressionException e) {
            throw new RuntimeException(e);
        }
    };
}
