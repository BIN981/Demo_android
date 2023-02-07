package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnnext, btnback;// b1 khai bao

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        // b2: ket noi bien voi view control tren layout qua id
//        btnnext =(Button) findViewById(R.id.buttonNext);
//        //b3: viet su kien
//        btnnext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent it= new Intent(MainActivity.this, ActivitySignin.class);
//                startActivity(it);
//            }
//        });
//        btnback = (Button) findViewById(R.id.buttonBack);
//        btnback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent it= new Intent(MainActivity.this, Activity1.class);
//                startActivity(it);
//            }
//        });


    }
}