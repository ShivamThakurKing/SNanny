package com.example.snanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NaniLogin extends AppCompatActivity implements View.OnClickListener {
    //VARIABLES OF THE CLASS
    TextView textViewregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nani_login);
        //FIND THE ID'S OF THE VIEWS
        findids();
        //UNDERLINE THE SIGNUP TEXTVIEW
        textViewregister.getPaint().setUnderlineText(true);
        textViewregister.setOnClickListener(this);
    }

    private void findids() {

        textViewregister = findViewById(R.id.signuptextview2);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){

            case(R.id.signuptextview2):
                //THIS TEXTVIEW WILL REGISTER NEW USERS INTO THE APP.
                Toast.makeText(this, "TextView is being Clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class));



        }
    }
}
