package com.example.a533.exam;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        setListener();
    }

    private void setListener(){
        findViewById(R.id.btn_dialog_open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(Question2.this);
                dialog.setContentView(R.layout.question_2_dialog);
                dialog.setTitle("Question 2");

                dialog.findViewById(R.id.btn_aye).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Vroomm!", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });

                dialog.findViewById(R.id.btn_annuler).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "It's treason then !", Toast.LENGTH_LONG).show();
                        dialog.dismiss();

                    }
                });

                dialog.show();
            }
        });
    }
}
