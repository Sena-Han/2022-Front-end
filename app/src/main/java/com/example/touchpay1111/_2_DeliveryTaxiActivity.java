package com.example.touchpay1111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class _2_DeliveryTaxiActivity extends AppCompatActivity {

    Button deliveryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_delivery_taxi);

        deliveryButton = findViewById(R.id.deliveryButton);

        deliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _3_D_MenuActivity.class);
                startActivity(intent);
            }
        });

    }
}