package com.example.palakjain.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etn1, etn2;
    Button addbtn, subbtn, mulbtn, divbtn, equalsbtn;
    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn1 = (EditText) findViewById(R.id.num1);
//        etn2 = (EditText) findViewById(R.id.num2);
        addbtn = (Button) findViewById(R.id.add);
        subbtn = (Button) findViewById(R.id.sub);
        mulbtn = (Button) findViewById(R.id.mul);
        divbtn = (Button) findViewById(R.id.div);
        equalsbtn = (Button) findViewById(R.id.result);
//        tvresult = (TextView) findViewById(R.id.viewResult);

        addbtn.setOnClickListener(this);
        subbtn.setOnClickListener(this);
        mulbtn.setOnClickListener(this);
        divbtn.setOnClickListener(this);
        equalsbtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        int a = Integer.valueOf(etn1.getText().toString());
        Log.d("TAG", "onClick: "+a);
        int b = 0;
        int c = 0;
      //  etn1.setText(null);

        switch(v.getId())
        {

            case R.id.add :
                b = Integer.valueOf(etn1.getText().toString());
                etn1.setText("");
                 c = a + b;
                break;

            case R.id.sub :
                etn1.setText(null);

                b = Integer.valueOf(etn1.getText().toString());
                c = a - b; break;

            case R.id.mul :         etn1.setText(null);

                b = Integer.valueOf(etn1.getText().toString());
                c = a * b; break;

            case R.id.div :        etn1.setText(null);

                b = Integer.valueOf(etn1.getText().toString());
                c = a / b; break;

            case R.id.result : etn1.setText(String.valueOf(c));
        }
    }
}
