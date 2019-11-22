package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtheight, edtWeight, edtBmi, edtCategory;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtheight = (EditText) findViewById(R.id.heightin);
        edtWeight = (EditText) findViewById(R.id.inweight);
        edtBmi = (EditText) findViewById(R.id.bmiResult);
        edtCategory = (EditText) findViewById(R.id.bmiCategory);
        btnCalculate = (Button) findViewById(R.id.calculate);


        //the action code
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int height = Integer.parseInt(edtheight.getText().toString());
                int weight = Integer.parseInt(edtWeight.getText().toString());
                double finalHeight = (double)height / 100;
                double bmi = weight/(finalHeight*finalHeight);
               Double BMI = new Double(bmi);
                edtBmi.setText(BMI.toString());
                String cat;
                if (bmi < 18.5) {
                    cat = "Underweight";
                } else if (bmi < 25) {
                   cat = "Normal weight";
                } else if (bmi < 30) {
                    cat = "Overweight ";
                } else
                    cat = " Obesity" ;
                    edtCategory.setText(cat);

            }
        });
    }


}