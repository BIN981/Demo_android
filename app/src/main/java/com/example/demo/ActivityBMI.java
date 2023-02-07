package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityBMI extends AppCompatActivity {
    Button btn_back, btn_next, btnbmi;
    EditText edtchieucao, edtcannang;
    TextView chiso , danhgia;
    float chieucao, cannang, bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmilayout);
        Init();
        btnbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chieucao = Float.parseFloat(edtchieucao.getText().toString());
                cannang = Float.parseFloat(edtcannang.getText().toString());
                bmi = cannang/(chieucao*2);

                chiso.setText(bmi+"");
                if(bmi<18.5){
                    danhgia.setText("Thieu Can - Gay");
                }else if(18.5 <=bmi && bmi <=24.9){
                    danhgia.setText(" Binh Thuong");
                }
                else if (bmi>24.9){
                    danhgia.setText(" Beo - Thua Can");
                }
            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(ActivityBMI.this, ActivityMenu.class);
                startActivity(it);
            }
        });

    }

    private void Init() {
        btnbmi = findViewById(R.id.btnbmi);
        edtcannang = findViewById(R.id.et_cannang);
        edtchieucao = findViewById(R.id.et_chieucao);
        chiso= findViewById(R.id.chiso);
        danhgia = findViewById(R.id.danhgia);
    }

}
