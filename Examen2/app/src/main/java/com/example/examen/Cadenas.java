package com.example.examen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadenas extends AppCompatActivity  {
EditText cas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadenas);

        cas = findViewById(R.id.cads);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.cad,menu);

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            funciones fu = new funciones();
        cas = findViewById(R.id.cads);


        if(item.getItemId()==R.id.palomit){
            Toast.makeText(this, "" + (fu.palindromo(cas.getText().toString())) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.pal){
            Toast.makeText(this, "" + (fu.palindromo(cas.getText().toString())) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.palomit2){
            Toast.makeText(this, "voc: " + (fu.vocales(cas.getText().toString())) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.vocales){
            Toast.makeText(this, "voc: " + (fu.vocales(cas.getText().toString())) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.palomit3){
            Toast.makeText(this, "conso: " + (fu.consonantes(cas.getText().toString())) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.conso){
            Toast.makeText(this, "conso: " + (fu.consonantes(cas.getText().toString())) , Toast.LENGTH_SHORT).show();

        }



        return super.onOptionsItemSelected(item);


    }


}