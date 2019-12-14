package com.example.homework1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int value1;
    int value2;
    String op;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);
    }

    public void onClinic(View v) {
        switch (v.getId()) {
            case R.id.zero:
                textView.append("0");
                break;
            case R.id.one:
                textView.append("1");
                break;
            case R.id.two:
                textView.append("2");
                break;
            case R.id.three:
                textView.append("3");
                break;
            case R.id.four:
                textView.append("4");
                break;
            case R.id.five:
                textView.append("5");
                break;
            case R.id.six:
                textView.append("6");
                break;
            case R.id.seven:
                textView.append("7");
                break;
            case R.id.eight:
                textView.append("8");
                break;
            case R.id.nine:
                textView.append("9");
                break;
        }
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.multiply:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "*");
                op="*";
                break;
            case R.id.plus:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "+");
                op="+";
                break;
            case R.id.minus:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "-");
                op="-";
                break;
            case R.id.devite:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "/");
                op="/";
                break;
            case R.id.equel:
                String first = textView.getText().toString().replace(value1 + op+"", "");
                value2 = Integer.valueOf(first);
                switch (op){
                    case "+":
                        textView.setText(value1 + "+" + value2 + "=" + (value1 + value2));
                        break;
                    case "-":
                        textView.setText(value1 + "-" + value2 + "=" + (value1 - value2));
                        break;
                    case "*":
                        textView.setText(value1 + "*" + value2 + "=" + (value1 * value2));
                        break;
                    case "/":
                        textView.setText(value1 + "/" + value2 + "=" + (float)value1 / value2);
                        break;
                }

                break;
            case R.id.c:
                textView.setText("");
                break;
        }
    }


}
