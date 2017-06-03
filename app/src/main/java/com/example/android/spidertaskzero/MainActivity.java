package com.example.android.spidertaskzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {
//initializing value with 0
int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // function  to increment the value and then display it by calling displayValue function
    public void numberIncrement(View v){
        value=value+1;
        displayValue(value);
    }
    //function to display the value
    public void displayValue(int number) {
        TextView scoreView = (TextView) findViewById(R.id.number_value);
        scoreView.setText(String.valueOf(number));
    }
}
