package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView testView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        testView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        double money = intent.getDoubleExtra("message",0);
        testView2.setText("£ " + 0.77*money);
    }
}
