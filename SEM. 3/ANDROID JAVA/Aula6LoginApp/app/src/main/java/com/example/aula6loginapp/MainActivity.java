package com.example.aula6loginapp;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        carregar();
    }

    public void Salvar(View v) {
        Log.i("persistencia", "Salvar");

        //Recuparar os Activity do Edits
        EditText nomeET = findViewById(R.id.editTextNome);
        EditText senhaET = findViewById(R.id.editTextSenha);
        EditText numeroET = findViewById(R.id.editTextNumero);

        //Recuperar os valores
        String nome = nomeET.getText().toString();
        String senha = senhaET.getText().toString();
        int numero = Integer.parseInt(numeroET.getText().toString());

        //Salvar os valores
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("nome", nome);
        editor.putString("senha", senha);
        editor.putInt("numero", numero);
        editor.apply();
        finish();
    }

    @SuppressLint("SetTextI18n")
    public void carregar() {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        String nome = sp.getString("nome", "");
        String senha = sp.getString("senha", "");
        int numero = sp.getInt("numero", 0);

        //Recuparar os Activity do Edits
        EditText nomeET = findViewById(R.id.editTextNome);
        EditText senhaET = findViewById(R.id.editTextSenha);
        EditText numeroET = findViewById(R.id.editTextNumero);

        nomeET.setText(nome);
        senhaET.setText(senha);
        numeroET.setText(Integer.toString(numero));
    }

    public void Fechar(View v) {
        finish();
    }
}