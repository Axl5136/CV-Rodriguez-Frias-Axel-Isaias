package com.example.crudistoaxl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button baltas, bbajas, bcambios, bconsultas;
    ImageView ima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baltas= findViewById(R.id.baltas);
        baltas.setOnClickListener(this);
        bbajas = findViewById(R.id.bbajas);
        bbajas.setOnClickListener(this);
        bcambios = findViewById(R.id.bcambios);
        bcambios.setOnClickListener(this);
        bconsultas = findViewById(R.id.bconsultas);
        bconsultas.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        if (cadenita.equals("Altas")){
            Intent intento = new Intent(MainActivity.this, Altas.class);
            startActivity(intento);
        }else if (cadenita.equals("Bajas")){
                Intent intento = new Intent(MainActivity.this, Bajas.class);
                startActivity(intento);
            }else if (cadenita.equals("Cambios")){
                    Intent intento = new Intent(MainActivity.this, Cambios.class);
                    startActivity(intento);
                }else if (cadenita.equals("Consultas")){
                        Intent intento = new Intent(MainActivity.this, Consultas.class);
                        startActivity(intento);
                    }
    }
}