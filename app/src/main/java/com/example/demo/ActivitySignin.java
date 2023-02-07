package com.example.demo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySignin extends AppCompatActivity {
    Button btn_login, btn_cancel;
    EditText edttk, edtmk;
    TextView tvtb;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlayout);
        edttk = findViewById(R.id.et_username);
        edtmk = findViewById(R.id.et_password);
        tvtb = findViewById(R.id.tvtb);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tk, mk;
                tk = edttk.getText().toString();
                mk = edtmk.getText().toString();
                if (tk.endsWith("se1604") && mk.endsWith("123")) {
                    Intent it = new Intent(ActivitySignin.this, ActivityBMI.class);
                    startActivity(it);
                }else {
                    tvtb.setText("dang nhap that bai");

                }

            }
        });
    }
}
