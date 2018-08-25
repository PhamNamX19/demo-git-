package com.example.pc.webview_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActivityScrollView extends Activity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview_ad);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn13);
        btn12=findViewById(R.id.btn14);
        btn12=findViewById(R.id.btn15);
        btn12=findViewById(R.id.btn16);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebView();
            }
        });


    }


    public void openWebView(){
        Intent myIntent=new Intent(this, ActivityScrollView.class);
        startActivity(myIntent);
    }
}
