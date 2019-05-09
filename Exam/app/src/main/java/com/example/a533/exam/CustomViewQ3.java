package com.example.a533.exam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

public class CustomViewQ3 extends View {
    private String password = "0101";
    private String passwordEnter = "";
    private OnSuccessPasswordListener successListener;
    public CustomViewQ3(Context context) {
        super(context);
    }

    public CustomViewQ3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewQ3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // super.onDraw(canvas);
        Paint whitePaint = new Paint();
        whitePaint.setColor(Color.WHITE);
        canvas.drawCircle(200,100,50,new Paint());
        canvas.drawCircle(400,100,50,new Paint());
        canvas.drawCircle(600,100,50,new Paint());
        canvas.drawCircle(800,100,50,new Paint());

        if(passwordEnteredLength()<4){
            canvas.drawCircle(800,100,40,whitePaint);
        }
        if(passwordEnteredLength()<3){
            canvas.drawCircle(600,100,40,whitePaint);
            canvas.drawCircle(800,100,40,whitePaint);
        }
        if(passwordEnteredLength()<2){
            canvas.drawCircle(400,100,40,whitePaint);
            canvas.drawCircle(600,100,40,whitePaint);
            canvas.drawCircle(800,100,40,whitePaint);
        }
        if(passwordEnteredLength()<1){
            canvas.drawCircle(200,100,40,whitePaint);
            canvas.drawCircle(400,100,40,whitePaint);
            canvas.drawCircle(600,100,40,whitePaint);
            canvas.drawCircle(800,100,40,whitePaint);
        }
    }

    public interface OnSuccessPasswordListener{
        public void onSuccessPassword();
    }

    public void setOnSuccessPasswordListener(OnSuccessPasswordListener newOnSuccessPasswordListener){
        successListener = newOnSuccessPasswordListener;
    }

    public void setInput(String input){
        passwordEnter += input;
        if(passwordEnteredLength() == 4){
            validatePassword();
        }
        invalidate();
    }
    private int passwordEnteredLength(){
        return passwordEnter.length();
    }

    private void validatePassword(){
        if(passwordEnter.equals(password)){
            successListener.onSuccessPassword();
            passwordEnter = "";
            invalidate();
        } else {
            Toast.makeText(getContext(),"Pas le bon password", Toast.LENGTH_LONG).show();
            passwordEnter = "";
            invalidate();
        }
    }
}
