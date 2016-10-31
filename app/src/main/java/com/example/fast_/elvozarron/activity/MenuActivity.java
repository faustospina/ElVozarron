package com.example.fast_.elvozarron.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fast_.elvozarron.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void pasarAventanaEntrenador(View view) {
        Intent intent = new Intent(this, EntrenadoresActivity.class); startActivity(intent);


    }
}
