package com.example.intent_recebendodados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fechar(View v){
        finish()
    }
    public void login(View v){
        EditText LoginET = findViewById(R.id.NomeEditText);
        EditText senhaET = findViewById(R.id.SenhaEditText);
        String login = LoginET.getText().toString();
        String senha = senhaET.getText().toString();

        Intent intent = new Intent()

    }
}