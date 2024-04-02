package br.com.teste.aula3loginapp;

import static br.com.teste.aula3loginapp.R.*;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText loginInput = findViewById(R.id.etLogin);
        EditText passwordInput = findViewById(R.id.etSenha);
        Button loginButton = findViewById(R.id.bLogar);
        loginButton.setOnClickListener(v -> {
            String login = loginInput.getText().toString();
            String password = passwordInput.getText().toString();
            if ("aluno".equals(login) && "123456".equals(password)) {
                Intent intent = new Intent(MainActivity.this, Logado.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(MainActivity.this, ErroTela.class);
                startActivity(intent);
            }
    });
}}