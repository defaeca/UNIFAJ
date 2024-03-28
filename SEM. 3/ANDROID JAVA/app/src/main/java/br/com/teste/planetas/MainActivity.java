package br.com.teste.planetas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
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
        initSpinnerp();
        //initSpinnerT();
    }

    private void initSpinnerp(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planetasArray,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinnerPlanetas);
        spinner.setAdapter(adapter);
    }

    public void showSelecionados(View v){
        Spinner planetasSpinner = findViewById(R.id.spinnerPlanetas);
        Spinner timesASpinner = findViewById(R.id.spinnerTimes);

        Object planetaObj = planetasSpinner.getSelectedItem();
        Object timeAObj = timesASpinner.getSelectedItem();

        String planeta = planetaObj.toString();
        String timeA = timeAObj.toString();

        String messagem = "Planeta Selecionado:" + planeta
                + " Time Selecionado: " +timeA;

        Toast.makeText(this, messagem, Toast.LENGTH_LONG)
                .show();
    }
    /*public void initSpinner(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.timesSerieA,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinnerTimes);
        spinner.setAdapter(adapter);
    }*/
}
