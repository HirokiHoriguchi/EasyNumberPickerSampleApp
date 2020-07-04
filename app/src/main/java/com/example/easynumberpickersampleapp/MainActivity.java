package com.example.easynumberpickersampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private NumberPicker numberPicker1, numberPicker2, numberPicker3, numberPicker4, numberPicker5;
    private TextView textView;
    private Button button;
    private String[] figures = new String[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataInit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                figures[0] = String.valueOf(numberPicker1.getValue());
                figures[1] = String.valueOf(numberPicker2.getValue());
                figures[2] = String.valueOf(numberPicker3.getValue());
                figures[3] = String.valueOf(numberPicker4.getValue());
                figures[4] = String.valueOf(numberPicker5.getValue());
                String str = String.format("%s%s%s.%s%s",
                        figures[0], figures[1], figures[2], figures[3], figures[4]);
                Float fig = Float.parseFloat(str);
                textView.setText(String.valueOf(fig));
        }
    }

    private void DataInit(){
        numberPicker1 = findViewById(R.id.num1);
        numberPicker2 = findViewById(R.id.num2);
        numberPicker3 = findViewById(R.id.num3);
        numberPicker4 = findViewById(R.id.num4);
        numberPicker5 = findViewById(R.id.num5);
        textView = findViewById(R.id.textview);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        NumberPickerInit();

    }

    private void NumberPickerInit(){
        numberPicker1.setMaxValue(9);
        numberPicker1.setMinValue(0);
        numberPicker2.setMaxValue(9);
        numberPicker2.setMinValue(0);
        numberPicker3.setMaxValue(9);
        numberPicker3.setMinValue(0);
        numberPicker4.setMaxValue(9);
        numberPicker4.setMinValue(0);
        numberPicker5.setMaxValue(9);
        numberPicker5.setMinValue(0);
    }

}
