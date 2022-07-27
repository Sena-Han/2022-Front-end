package com.example.touchpay1111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _4_T_SchoolSelectActivity extends AppCompatActivity {

    Button stationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_tschool_select);

        stationButton = findViewById(R.id.stationButton);

        stationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _4_T_StationSelect_1Activity.class);
                startActivity(intent);
            }
        });
    }
}