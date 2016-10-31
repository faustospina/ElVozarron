package com.example.fast_.elvozarron.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.fast_.elvozarron.R;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] personalidades = {"Spanish","English"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,  android.R.layout.simple_spinner_item, personalidades);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adaptador);
    }

    /**
     * a kse llama la otra actividad
     * @param view
     */
    public void pasarAVentanaInicio(View view) {
        Intent intent = new Intent(this, MenuActivity.class); startActivity(intent);


    }

}
