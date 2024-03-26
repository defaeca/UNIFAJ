package br.com.teste.calculadoraandroidjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1;
    private EditText txtNum2;
    private TextView tResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        tResultado = findViewById(R.id.tResultado);
    }

    public void somar(View view) {
        float valor1 = Integer.parseInt(txtNum1.getText().toString());
        float valor2 = Integer.parseInt(txtNum2.getText().toString());
        tResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view) {
        float valor1 = Integer.parseInt(txtNum1.getText().toString());
        float valor2 = Integer.parseInt(txtNum2.getText().toString());
        tResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void multiplicar(View view) {
        float valor1 = Integer.parseInt(txtNum1.getText().toString());
        float valor2 = Integer.parseInt(txtNum2.getText().toString());
        tResultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view) {
        float valor1 = Integer.parseInt(txtNum1.getText().toString());
        float valor2 = Integer.parseInt(txtNum2.getText().toString());
        tResultado.setText(String.valueOf(valor1 / valor2));
    }
}