package com.example.touchpay1111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class _4_D_RoomSelectActivity extends AppCompatActivity {

    Button newRoomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_droom_select);

        newRoomButton = findViewById(R.id.newRoomButton);

        newRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), _5_D_NewRoomActivity.class);
                startActivity(intent);
            }
        });
    }
}