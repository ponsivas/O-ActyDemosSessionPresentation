package com.example.actydemossessionpresentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button FD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FD = findViewById(R.id.SFA);

        FD.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Moving to First Activity - Exiting the Second Activity - Thank you", Toast.LENGTH_LONG);
            toast.show();
            Intent i = new Intent(SecondActivity.this,MainActivity.class);
            startActivity(i);
        });
    }
}