package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Xml;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
String letritas[]={"Calculadora", "Cadenas", "Imagenes"};
int img[]={R.drawable.gatoimg, R.drawable.cad, R.drawable.op};

ListView listita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listita=findViewById(R.id.vistita);
        listita.setOnItemClickListener(this);
        adaptador adaptadorsito=new adaptador(getApplicationContext() , letritas , img);
        listita.setAdapter(adaptadorsito);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String cadenita = String.valueOf(position);
        if(position==0){
            Intent intent= new Intent(this, menuzz.class);
            startActivity(intent);

        }
        if(position==1){
            Intent intent= new Intent(this, Cadenas.class);
            startActivity(intent);

        }
        if(position==2){
            Intent intent= new Intent(this, sensor.class);
            startActivity(intent);

        }



    }

}