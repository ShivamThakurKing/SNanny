package com.example.snanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button nextpageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        
        findids();
        //SETTING ON CLICK LISTENER 
        nextpageButton.setOnClickListener(this);
    }

    private void findids() {
        nextpageButton = findViewById(R.id.signupgetdetailsbutton);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.signupgetdetailsbutton:
                Toast.makeText(this, "Next Step", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),BankDetails.class));
                
        }
    }
}
