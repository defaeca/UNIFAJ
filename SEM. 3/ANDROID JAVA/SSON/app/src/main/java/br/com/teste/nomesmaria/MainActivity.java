package br.com.teste.nomesmaria;

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

    public void parserJSON(View v){
        EditText jsonET = findViewById(R.id.EditTextJson);
        String json = jsonET.getText().toString();
        Pessoa p = new Pessoa();
        try{
            p.fromJSON(json);
            exibirValores(p);
        } catch (Exception ex){
            Toast.makeText(this, "Erro no parserJSON: "+ ex.getMessage(),
                    Toast.LENGTH_LONG).show();
            return;
        }
    }
    private  void exibirValores(Pessoa p){
        EditText nomeET = findViewById(R.id.EditTextNome);
        EditText idadeET = findViewById(R.id.EditTextIdade);
        EditText pesoET = findViewById(R.id.EditTextPeso);
        EditText alturaET = findViewById(R.id.EditTextAltura);
        EditText paiET = findViewById(R.id.EditTextNomePai);
        EditText maeET = findViewById(R.id.EditTextNomeMae);
        EditText casadaET = findViewById(R.id.EditTextCasado);
        EditText amigosET = findViewById(R.id.EditTextAmigos);

        nomeET.setText(p.nome);
        idadeET.setText(Integer.toString(p.idade));
        pesoET.setText(Double.toString(p.peso));
        alturaET.setText(Integer.toString(p.altura));
        paiET.setText(p.pai);
        maeET.setText(p.mae);
        casadaET.setText(Boolean.toString(p.casada));
        amigosET.setText(p.amigos.toString());

    }
}