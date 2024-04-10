package com.example.aula4carroapp;

import android.os.Bundle;import android.view.View;import android.widget.ArrayAdapter;
import android.widget.EditText;import android.widget.ListView;import android.widget.Spinner;
import android.widget.Toast;import androidx.appcompat.app.AppCompatActivity;import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etModelo, etAno;
    Spinner spinnerMarca;
    ListView lvCarros;
    ArrayList<String> carrosList;
    ArrayAdapter<String> carrosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etModelo = findViewById(R.id.etModelo);
        etAno = findViewById(R.id.etAno);
        spinnerMarca = findViewById(R.id.spinnerMarca);
        lvCarros = findViewById(R.id.lvCarros);

        ArrayAdapter<CharSequence> marcaAdapter = ArrayAdapter.createFromResource(this,
                R.array.MarcasArray, android.R.layout.simple_spinner_item);
        marcaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMarca.setAdapter(marcaAdapter);

        carrosList = new ArrayList<>();
        carrosAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, carrosList);
        lvCarros.setAdapter(carrosAdapter);
        lvCarros.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }

    public void onAddClicked(View view) {
        String marca = spinnerMarca.getSelectedItem().toString();
        String modelo = etModelo.getText().toString();
        String ano = etAno.getText().toString();
        if (!modelo.isEmpty() && !ano.isEmpty()) {
            carrosList.add("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
            carrosAdapter.notifyDataSetChanged();
            etModelo.setText("");
            etAno.setText("");
        } else {
            Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
        }
    }

    public void onDeleteClicked(View view) {
        int pos = lvCarros.getCheckedItemPosition();
        if (pos > -1) {
            carrosList.remove(pos);
            carrosAdapter.notifyDataSetChanged();
            lvCarros.setItemChecked(pos, false);
        } else {
            Toast.makeText(this, "Por favor, selecione um item para remover.", Toast.LENGTH_SHORT).show();
        }
    }
}


