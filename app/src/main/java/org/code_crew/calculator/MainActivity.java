package org.code_crew.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Define variables to use for input and calculations

    private TextView input;
    private int value;
    private String holdin= "";
    private String operator;
    private TextView endValue;
    private int endProcess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView)findViewById(R.id.newNumber);
        endValue = (TextView) findViewById(R.id.result);

        // Add any variables to handle the input
    }

    public void zero_input(View view) {

        value = 0;
        holdin += value;
        input.setText(holdin);

    }

    public void one_input(View view) {

        value = 1;
        holdin += value;
        input.setText(holdin);
    }

    public void two_input(View view) {

        value = 2;
        holdin += value;
        input.setText(holdin);
    }

    public void three_input(View view) {

        value = 3;
        holdin += value;
        input.setText(holdin);
    }

    public void four_input(View view) {

        value = 4;
        holdin += value;
        input.setText(holdin);
    }

    public void five_input(View view) {

        value = 5;
        holdin += value;
        input.setText(holdin);
    }

    public void six_input(View view) {

        value = 6;
        holdin += value;
        input.setText(holdin);
    }

    public void seven_input(View view) {

        value = 7;
        holdin += value;
        input.setText(holdin);
    }

    public void eight_input(View view) {

        value = 8;
        holdin += value;
        input.setText(holdin);
    }

    public void nine_input(View view) {

        value = 9;
        holdin += value;
        input.setText(holdin);
    }

    public void division_input(View view) {

        operator = "/";
        holdin += operator;
        input.setText(holdin);

    }

    public void multiply_input(View view) {

        operator = "*";
        holdin += operator;
        input.setText(holdin);

    }

    public void subtraction_input(View view) {

        operator = "-";
        holdin += operator;
        input.setText(holdin);

    }

    public void addition_input(View view) {

        operator = "+";
        holdin += operator;
        input.setText(holdin);

    }

    public void clear_input(View view) {

        holdin ="";
        input.setText(holdin);

    }

    public void equal_button(View view) {
//        Log.d("PJ", holdin.toString());
//        endProcess = Integer.parseInt(holdin);
        endProcess = 10;
        endValue.setText(endProcess);

    }

    // Add method to handler operators

    // Add method(s) to handle performing the operations

    // Add method(s) to handle numbers

    // Add method(s) to Handle Clear function
}
