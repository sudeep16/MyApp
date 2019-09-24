package com.application.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSum, btnFtoC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnSum = findViewById(R.id.btnSum);
        btnFtoC = findViewById(R.id.btnFtoC);

        btnSum.setOnClickListener(this);
        btnFtoC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSum){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.btnFtoC){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
