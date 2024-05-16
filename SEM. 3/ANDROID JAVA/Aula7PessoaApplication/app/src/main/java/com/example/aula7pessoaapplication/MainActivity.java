package com.example.aula7pessoaapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    /**
    String json =
            "{"
                    + "\"nome\": \"Maria\""
            + "}";
    */

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
    }

    public void parserJSON(View v) {
        EditText jsonET = findViewById(R.id.editTextJson);
        String json = jsonET.getText().toString();
        Pessoa p = new Pessoa();
        try {
            p.fromJSON(json);
            exibirValores(p);
        } catch (Exception ex) {
            Toast.makeText(this, "Erro no parserJSON:" + ex.getMessage(),
                    Toast.LENGTH_LONG).show();
            return;
        }
    }

    public void gerarJSON(View v) {
        EditText nomeET = findViewById(R.id.editTextNome);
        Pessoa p = new Pessoa();
        p.nome = nomeET.getText().toString();

        try {
            String json = p.toJSON();
            EditText jsonET = findViewById(R.id.editTextJson);
            jsonET.setText(json);
        } catch (Exception ex) {
            Toast.makeText(this, "Erro no toJSON:" + ex.getMessage(),
                    Toast.LENGTH_LONG).show();
            return;
        }
    }
    private void exibirValores(Pessoa p) {
        EditText nomeET = findViewById(R.id.editTextNome);
        EditText idadeET = findViewById(R.id.editTextIdade);
        EditText casa
        doET = findViewById(R.id.editTextCasado);
        EditText pesoET = findViewById(R.id.editTextPeso);
        EditText nascimentoET = findViewById(R.id.editTextNascimento);
        EditText amigosET = findViewById(R.id.editTextAmigos);

        nomeET.setText(p.nome);
        idadeET.setText(Integer.toString(p.idade));
        casadoET.setText(Boolean.toString(p.casada));
        pesoET.setText(Double.toString(p.peso));
        nascimentoET.setText(p.nascimento);
        amigosET.setText(p.amigos.toString());
    }

}