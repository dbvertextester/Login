package com.dbvetex.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text, text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.signup);
        text1 = findViewById(R.id.loginForgot);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotActiviy();
            }
        });
    }

        public void openActivity() {
        Intent intent = new Intent(this, sineUp.class);

        startActivity(intent);

    }

    public void forgotActiviy() {
        Intent intent = new Intent(this, forgotPass.class);
        startActivity(intent);
    }
}