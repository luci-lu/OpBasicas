package com.example.opbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText number1,number2;
    Button btn;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        res = (TextView) findViewById(R.id.result);
        btn = (Button) findViewById(R.id.suma);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int n1 =Integer.parseInt(number1.getText().toString());
        int n2 =Integer.parseInt(number2.getText().toString());
        res.setText("La suma es"+(n1+n2));
    }
}
