package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText first = findViewById(R.id.editText4);
        final EditText second = findViewById(R.id.editText3);
        final EditText ans = findViewById(R.id.editText2);
        Button add = findViewById(R.id.button3);
        Button mul = findViewById(R.id.button5);
        Button sub = findViewById(R.id.button4);
        Button div = findViewById(R.id.button6);
        Button mod = findViewById(R.id.button7);
        Button clr = findViewById(R.id.button8);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.valueOf(first.getText().toString())+Integer.valueOf(second.getText().toString())));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.valueOf(first.getText().toString())*Integer.valueOf(second.getText().toString())));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.valueOf(first.getText().toString())-Integer.valueOf(second.getText().toString())));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.valueOf(first.getText().toString())/Integer.valueOf(second.getText().toString())));

            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(String.valueOf(Integer.valueOf(first.getText().toString())%Integer.valueOf(second.getText().toString())));

            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.getText().clear();
                second.getText().clear();
                ans.getText().clear();
            }
        });

    }




}
