package com.application.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstNo, etSecondNo;
    private Button btnSum, btnSub;
    int first, second, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding
        etFirstNo = findViewById(R.id.etFirstNo);
        etSecondNo = findViewById(R.id.etSecondNo);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSubtract);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirstNo.getText().toString());
                second = Integer.parseInt(etSecondNo.getText().toString());
                result = first + second;

                //Toasting
                Toast.makeText(MainActivity.this, "Sum of above No. is " + result, Toast.LENGTH_LONG).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            first = Integer.parseInt(etFirstNo.getText().toString());
            second = Integer.parseInt(etSecondNo.getText().toString());
            result = first - second;

            //Toasting
            Toast.makeText(MainActivity.this, "Substraction of above No. is " + result, Toast.LENGTH_LONG).show();

           }
        });
}}
