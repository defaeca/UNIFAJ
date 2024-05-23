package br.com.teste.personaula;

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
    public void login(View v){
        //Recuperar os campos da Tela
        EditText loginET = findViewById(R.id.editTextLogin);
        EditText senhaET = findViewById(R.id.editTextSenha);
        EditText ipServidorET = findViewById(R.id.editTextIpServidor);

        //Recuperar os valores da tela
        Login l = new Login();
        l.login = loginET.getText().toString();
        l.senha = senhaET.getText().toString();

        try{
            String json = l.toJSON();
        } catch (Exception ex){
            ex.printStackTrace();
            Toast.makeText(this, "Erro"+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}