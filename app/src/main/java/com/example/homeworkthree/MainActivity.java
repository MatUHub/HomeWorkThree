package com.example.homeworkthree;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonPlus;
    Button buttonSubtract;
    Button buttonMultiply;
    Button buttonDivision;
    Button buttonComma;
    Button buttonDot;
    Button buttonEquals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);

        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);
        buttonFour = findViewById(R.id.button_four);
        buttonFive = findViewById(R.id.button_five);
        buttonSix = findViewById(R.id.button_six);
        buttonSeven = findViewById(R.id.button_seven);
        buttonEight = findViewById(R.id.button_eight);
        buttonNine = findViewById(R.id.button_nine);
        buttonZero = findViewById(R.id.button_zero);
        buttonPlus = findViewById(R.id.button_plus);
        buttonSubtract = findViewById(R.id.button_subtract);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivision = findViewById(R.id.button_division);
        buttonComma = findViewById(R.id.button_comma);
        buttonDot = findViewById(R.id.button_dot);
        buttonEquals = findViewById(R.id.button_equals);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonComma.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_one:
                textView.setText("1");
                break;
            case R.id.button_two:
                textView.setText("2");
                break;
            case R.id.button_three:
                textView.setText("3");
                break;
            case R.id.button_four:
                textView.setText("4");
                break;
            case R.id.button_five:
                textView.setText("5");
                break;
            case R.id.button_six:
                textView.setText("6");
                break;
            case R.id.button_seven:
                textView.setText("7");
                break;
            case R.id.button_eight:
                textView.setText("8");
                break;
            case R.id.button_nine:
                textView.setText("9");
                break;
            case R.id.button_zero:
                textView.setText("0");
                break;
            case R.id.button_plus:
                textView.setText("+");
                break;
            case R.id.button_subtract:
                textView.setText("-");
                break;
            case R.id.button_multiply:
                textView.setText("*");
                break;
            case R.id.button_division:
                textView.setText("/");
                break;
            case R.id.button_comma:
                textView.setText(",");
                break;
            case R.id.button_dot:
                textView.setText(".");
                break;
            case R.id.button_equals:
                textView.setText("=");
                break;
            default:
                break;
        }
    }


}