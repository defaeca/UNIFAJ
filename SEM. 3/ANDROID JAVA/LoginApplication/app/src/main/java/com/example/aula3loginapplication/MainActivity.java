package com.example.aula3loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fechar(View v) {
        finish();
    }


    public void login(View v) {
        EditText loginET = findViewById(R.id.editTextLogin);
        EditText senhaET = findViewById(R.id.editTextSenha);
        String login = loginET.getText().toString();
        String senha = senhaET.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("login", login);
        intent.putExtra("senha", senha);
        startActivity(intent);
    }
}