package com.example.a533.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListeners();
    }

    private void setListeners(){
        findViewById(R.id.btn_Q1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent question1Intent = new Intent(getApplicationContext(), Question1.class);
                startActivity(question1Intent);
            }
        });
        findViewById(R.id.btn_Q2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent question2Intent = new Intent(getApplicationContext(), Question2.class);
                startActivity(question2Intent);
            }
        });

        findViewById(R.id.btn_Q3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent question3Intent = new Intent(getApplicationContext(), Question3.class);
                startActivity(question3Intent);
            }
        });
    }
}
