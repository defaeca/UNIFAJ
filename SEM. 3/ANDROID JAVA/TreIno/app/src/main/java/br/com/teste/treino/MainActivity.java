package br.com.teste.treino;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View v) {
        EditText loginET = findViewById(R.id.bLogar);
        EditText senhaET = findViewById(R.id.eLSenha);

        String login = loginET.getText().toString();
        String senha = senhaET.getText().toString();

        Intent intent = new Intent(this, RegistrarMain.class);
        intent.putExtra("login", login);
        intent.putExtra("senha", senha);
        startActivity(intent);
    }
}
