package com.example.calcrealaula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fechar(View V){
        finish();
    }

    public void somar(View v){
        //Recuperar os campos de edição
        EditText Valor1 = findViewById(R.id.NumUm);
        EditText Valor2 = findViewById(R.id.NumDois);

        //Recuperar os números
        double num1 = Double.parseDouble(Valor1.getText().toString());
        double num2 = Double.parseDouble(Valor2.getText().toString());

        double soma = num1 +num2;

        //Exibir a soma

        TextView resultadoTV = findViewById(R.id.textResultado);
        resultadoTV.setText("Resultado: "+ soma);

    }
}

