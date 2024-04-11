package com.example.meusdadosapp;

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
        Log.i("Dados Pessoais", "Salvar");

        EditText nomeET = findViewById(R.id.editTextNome);
        EditText sobrenomeET = findViewById(R.id.editTextSobrenome);
        EditText idadeET = findViewById(R.id.editTextIdade);
        EditText salarioET = findViewById(R.id.editTextSalario);
        EditText sexoET = findViewById(R.id.editTextSexo);

        String nome = nomeET.getText().toString();
        String sobrenome = sobrenomeET.getText().toString();
        int idade = Integer.parseInt(idadeET.getText().toString());
        float salario = Float.parseFloat(salarioET.getText().toString());
        String sexo = sexoET.getText().toString();

        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("nome", nome);
        editor.putString("sobrenome", sobrenome);
        editor.putInt("idade", idade);
        editor.putFloat("salario", salario);
        editor.putString("sexo", sexo);
        editor.commit();
    }

    public void carregar() {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        String nome = sp.getString("nome", "");
        String sobrenome = sp.getString("sobrenome", "");
        int idade = sp.getInt("idade", 0);
        float salario = sp.getFloat("salario", 0 );
        String sexo = sp.getString("sexo", "");

        EditText nomeET = findViewById(R.id.editTextNome);
        EditText sobrenomeET = findViewById(R.id.editTextSobrenome);
        EditText idadeET = findViewById(R.id.editTextIdade);
        EditText salarioET = findViewById(R.id.editTextSalario);
        EditText sexoET = findViewById(R.id.editTextSexo);

        nomeET.setText(nome);
        sobrenomeET.setText(sobrenome);
        idadeET.setText(Integer.toString(idade));
        salarioET.setText(Float.toString(salario));
        sexoET.setText(sexo);
    }

    public void Cancelar(View v) {
        finish();

    }
}