package com.julius.alc4phase1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;


import android.widget.Button;

public class MainActivityA extends AppCompatActivity {
    Button Button1;
    Button Button2;

    public void init(){
        Button1 = findViewById(R.id.Button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivityA.this, ActivityB.class);
                startActivity(intent);
            }
        });
    }
     public void prof(){
        Button2= findViewById(R.id.Button2);
         Button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent= new Intent(MainActivityA.this, ActivityC.class);
                 startActivity(intent);
             }
         });
     }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        prof();


    }




}
