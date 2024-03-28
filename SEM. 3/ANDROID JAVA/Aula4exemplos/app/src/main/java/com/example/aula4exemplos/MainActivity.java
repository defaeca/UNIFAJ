package com.example.aula4exemplos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void exibirMensagem(View v) {
        Toast.makeText(this, "Exemplo de projeto demorando para criar", Toast.LENGTH_SHORT).show();
    }
    private String textoVoltar = "";
    public void exibirSnack(View v){
        EditText et = findViewById(R.id.editTextLimpar);
        this.textoVoltar = et.getText().toString();
        et.setText("");

        Snackbar.make(v,"Texto Limpo",Snackbar.LENGTH_LONG)
                .setAction("voltar text", a -> voltarText())
                .show();
    }

    public void voltarText(){
        EditText et = findViewById(R.id.editTextLimpar);
        et.setText(this.textoVoltar);
    }
}