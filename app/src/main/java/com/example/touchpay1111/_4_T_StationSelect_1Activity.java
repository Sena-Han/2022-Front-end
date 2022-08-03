package com.example.touchpay1111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _4_T_StationSelect_1Activity extends AppCompatActivity {

    Button s_1, s_2, s_3, s_4, s_5, s_6, s_7, s_8, s_9, s_I1, s_I2, s_SB, s_GU, sGC, s_SI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_tstation_select1);

        s_1 = findViewById(R.id.s_1);
        s_2 = findViewById(R.id.s_2);
        s_3 = findViewById(R.id.s_3);
        s_4 = findViewById(R.id.s_4);
        s_5 = findViewById(R.id.s_5);
        s_6 = findViewById(R.id.s_6);
        s_7 = findViewById(R.id.s_7);
        s_8 = findViewById(R.id.s_8);
        s_9 = findViewById(R.id.s_9);
        s_I1 = findViewById(R.id.s_I1);
        s_I2 = findViewById(R.id.s_I2);
        s_SB = findViewById(R.id.s_SB);
        s_GU = findViewById(R.id.s_GU);
        sGC = findViewById(R.id.s_GC);
        s_SI = findViewById(R.id.s_SI);

        s_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s1Activity.class);
                startActivity(intent);
            }
        });

        s_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s2Activity.class);
                startActivity(intent);
            }
        });

        s_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s3Activity.class);
                startActivity(intent);
            }
        });

        s_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s4Activity.class);
                startActivity(intent);
            }
        });

        s_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s5Activity.class);
                startActivity(intent);
            }
        });

        s_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s6Activity.class);
                startActivity(intent);
            }
        });

        s_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s7Activity.class);
                startActivity(intent);
            }
        });

        s_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s8Activity.class);
                startActivity(intent);
            }
        });

        s_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s9Activity.class);
                startActivity(intent);
            }
        });

        s_I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_sI1Activity.class);
                startActivity(intent);
            }
        });

        s_I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_s2Activity.class);
                startActivity(intent);
            }
        });

        s_SB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_sSBActivity.class);
                startActivity(intent);
            }
        });

        s_SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_sSIActivity.class);
                startActivity(intent);
            }
        });
    }
}