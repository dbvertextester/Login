package com.dbvetex.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTP extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        button = findViewById(R.id.otpSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otpActivity();
            }
        });
    }
    public void otpActivity(){
        Intent intent = new Intent(this,ResetPassword.class);
        startActivity(intent);
    }
}