package com.example.touchpay1111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _3_D_MenuActivity extends AppCompatActivity {

    Button pizza, western, chinese, japanese, bunsik, chicken, jokbal, noodle, burger, meat, dessert, jjim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_dmenu);

        pizza = findViewById(R.id.pizza);
        western = findViewById(R.id.western);
        chinese = findViewById(R.id.chinese);
        japanese = findViewById(R.id.japanese);
        bunsik = findViewById(R.id.bunsik);
        chicken = findViewById(R.id.chicken);
        jokbal = findViewById(R.id.jokbal);
        noodle = findViewById(R.id.noodle);
        burger = findViewById(R.id.burger);
        meat = findViewById(R.id.meat);
        dessert = findViewById(R.id.dessert);
        jjim = findViewById(R.id.jjim);

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        western.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        bunsik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        jokbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        noodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
        jjim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_D_RoomSelectActivity.class);
                startActivity(intent);
            }
        });
    }
}