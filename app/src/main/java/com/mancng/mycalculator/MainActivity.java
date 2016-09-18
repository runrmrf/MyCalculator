package com.mancng.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numFirst;
    private EditText numSecond;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private Button btnClear;
    private TextView txtResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numFirst = (EditText) findViewById(R.id.numFirst);
        numSecond = (EditText) findViewById(R.id.numSecond);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubstraction);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((numFirst.getText().length()> 0) && (numSecond.getText().length()>0)) {

                double firstNum = Double.parseDouble(numFirst.getText().toString());
                double secondNum = Double.parseDouble(numSecond.getText().toString());

                double theResult = firstNum + secondNum;
                txtResult.setText(Double.toString(theResult));

            } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }

            }
        });


        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((numFirst.getText().length()> 0) && (numSecond.getText().length()>0)) {

                    double firstNum = Double.parseDouble(numFirst.getText().toString());
                    double secondNum = Double.parseDouble(numSecond.getText().toString());

                    double theResult = firstNum - secondNum;
                    txtResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((numFirst.getText().length()> 0) && (numSecond.getText().length()>0)) {

                    double firstNum = Double.parseDouble(numFirst.getText().toString());
                    double secondNum = Double.parseDouble(numSecond.getText().toString());

                    double theResult = firstNum * secondNum;
                    txtResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((numFirst.getText().length()> 0) && (numSecond.getText().length()>0)) {

                    double firstNum = Double.parseDouble(numFirst.getText().toString());
                    double secondNum = Double.parseDouble(numSecond.getText().toString());

                    double theResult = firstNum / secondNum;
                    txtResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numFirst.setText("");
                numSecond.setText("");
                txtResult.setText("0.00");
                numFirst.requestFocus();
            }
        });


    }


}
