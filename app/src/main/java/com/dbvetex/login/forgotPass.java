package com.dbvetex.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class forgotPass extends AppCompatActivity {

    private Button pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        pass = findViewById(R.id.continueForgot);
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotActivity();
            }
        });
    }
    public void forgotActivity(){
        Intent intent = new Intent(this, OTP.class);
         startActivity(intent);
    }
}