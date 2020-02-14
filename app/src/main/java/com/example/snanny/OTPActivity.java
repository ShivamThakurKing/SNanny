package com.example.snanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OTPActivity extends AppCompatActivity implements View.OnClickListener {
    //VARIABLES OF THE CLASS
    Button verifyOTP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nani_specialities);
        verifyOTP = findViewById(R.id.veriyotpbutton);
        verifyOTP.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.veriyotpbutton:
                Toast.makeText(this, "OTP registration successfully ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),NaniHome.class));

        }
    }
}
