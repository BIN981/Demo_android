package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMenu extends AppCompatActivity {
    CheckBox cb_coffee, cb_suachua, cb_kem,cb_bimbim, cb_suachuanepcam;
    Button btn_dathang;
    TextView tv_tongtien;
    float tongtien=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Init();
        btn_dathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb_coffee.isChecked()){
                    tongtien+=20000;
                }
                if(cb_kem.isChecked()){
                    tongtien+=10000;
                }
                if (cb_bimbim.isChecked()){
                    tongtien+=5000;
                }
                if(cb_suachua.isChecked()){
                    tongtien+=20000;
                }
                if(cb_suachuanepcam.isChecked()){
                    tongtien+=12000;
                }
                tv_tongtien.setText(tongtien+"");
                Toast.makeText(ActivityMenu.this, tongtien+"", Toast.LENGTH_LONG).show();
            }

        });


}

    private void Init() {
        cb_coffee= findViewById(R.id.cb_coffee);
        cb_bimbim= findViewById(R.id.cb_bimbim);
        cb_kem= findViewById(R.id.cb_kem);
        cb_suachua= findViewById(R.id.cb_suachua);
        cb_suachuanepcam= findViewById(R.id.cb_suachuanepcam);
        btn_dathang = findViewById(R.id.btn_dathang);
        tv_tongtien = findViewById(R.id.tv_tongtien);
    }
    }
