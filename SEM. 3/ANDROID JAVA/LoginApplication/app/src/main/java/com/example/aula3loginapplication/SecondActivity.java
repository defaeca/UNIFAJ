package com.example.aula3loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String login = intent.getStringExtra("login");
        String senha = intent.getStringExtra("senha");

        TextView loginTV = findViewById(R.id.textViewLogin);
        TextView senhaTV = findViewById(R.id.textViewSenha);
        loginTV.setText(login);
        senhaTV.setText(senha);
    }

    public void fechar(View v) {
        finish();
    }

}