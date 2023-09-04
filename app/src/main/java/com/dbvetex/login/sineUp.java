package com.dbvetex.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sineUp extends AppCompatActivity {
    private TextView text,text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sine_up);
        text = findViewById(R.id.forgotSignUp);
        text1 = findViewById(R.id.TextLogin);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginActivity();
            }
        });
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }
    public void openActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void loginActivity(){
        Intent intent = new Intent(this,forgotPass.class);
        startActivity(intent);
    }
}