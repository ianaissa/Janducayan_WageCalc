package com.example.janducayan_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Calculate(View v){
        EditText hrWage = (EditText) findViewById(R.id.hourlyWage);
        EditText hrsWorked = (EditText) findViewById(R.id.hrsWorked);
        EditText result = (EditText) findViewById(R.id.wageResult);

        double hourlyWage = Double.parseDouble(hrWage.getText().toString());
        double hoursWorked = Double.parseDouble(hrsWorked.getText().toString());
        double res = hourlyWage * hoursWorked;

        result.setText("Your hourly wage is "+res);
    }

}