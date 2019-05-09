package com.example.a533.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        setListeners();
    }

    private void setListeners(){
        findViewById(R.id.btn_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomViewQ3 view = (CustomViewQ3)findViewById(R.id.customViewQ3);
                view.setInput("0");
            }
        });
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomViewQ3 view = (CustomViewQ3)findViewById(R.id.customViewQ3);
                view.setInput("1");
            }
        });
        CustomViewQ3 view = (CustomViewQ3)findViewById(R.id.customViewQ3);
        view.setOnSuccessPasswordListener(new CustomViewQ3.OnSuccessPasswordListener() {
            @Override
            public void onSuccessPassword() {
                Toast.makeText(getApplicationContext(), "Connexion successfull", Toast.LENGTH_LONG).show();
            }
        });
    }
}
