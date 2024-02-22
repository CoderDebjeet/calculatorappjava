package com.example.devjitcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstvalue1,etSecondValue1;
    TextView tvAns;
    Button add,subtract,multiply,divide;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstvalue1 = findViewById(R.id.firstvalue);
        etSecondValue1 = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvans);

        add = findViewById(R.id.btnadd);
        subtract = findViewById(R.id.btnsub);
        multiply = findViewById(R.id.btnmul);
        divide = findViewById(R.id.btndiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(firstvalue1.getText().toString());  /*firstvalue: This appears to be a variable where an integer value will be stored.
                                                                                    Integer.parseInt(): This is a method in Java used to parse an integer from a string.
                                                                                        firstvalue1: This seems to be the name of a GUI element (like a text field or label).
                                                                                                        .getText(): This is a method used to retrieve the text from the GUI element.
                                                                                                         .toString(): This converts the retrieved text to a string if it's not already in string format.*/
                secondvalue=Integer.parseInt(etSecondValue1.getText().toString());
                ans=firstvalue + secondvalue;
                tvAns.setText("Answer is : "+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(firstvalue1.getText().toString());  /*firstvalue: This appears to be a variable where an integer value will be stored.
                                                                                    Integer.parseInt(): This is a method in Java used to parse an integer from a string.
                                                                                        firstvalue1: This seems to be the name of a GUI element (like a text field or label).
                                                                                                        .getText(): This is a method used to retrieve the text from the GUI element.
                                                                                                         .toString(): This converts the retrieved text to a string if it's not already in string format.*/
                secondvalue=Integer.parseInt(etSecondValue1.getText().toString());
                ans=firstvalue - secondvalue;
                tvAns.setText("Answer is : "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(firstvalue1.getText().toString());  /*firstvalue: This appears to be a variable where an integer value will be stored.
                                                                                    Integer.parseInt(): This is a method in Java used to parse an integer from a string.
                                                                                        firstvalue1: This seems to be the name of a GUI element (like a text field or label).
                                                                                                        .getText(): This is a method used to retrieve the text from the GUI element.
                                                                                                         .toString(): This converts the retrieved text to a string if it's not already in string format.*/
                secondvalue=Integer.parseInt(etSecondValue1.getText().toString());
                ans=firstvalue * secondvalue;
                tvAns.setText("Answer is : "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(firstvalue1.getText().toString());  /*firstvalue: This appears to be a variable where an integer value will be stored.
                                                                                    Integer.parseInt(): This is a method in Java used to parse an integer from a string.
                                                                                        firstvalue1: This seems to be the name of a GUI element (like a text field or label).
                                                                                                        .getText(): This is a method used to retrieve the text from the GUI element.
                                                                                                         .toString(): This converts the retrieved text to a string if it's not already in string format.*/
                secondvalue=Integer.parseInt(etSecondValue1.getText().toString());
                ans=firstvalue / secondvalue;
                tvAns.setText("Answer is : "+ans);
            }
        });

    }
}