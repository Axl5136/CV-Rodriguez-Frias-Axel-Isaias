package com.example.crudistoaxl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Altas extends AppCompatActivity {
    Spinner comidatipo, comida;
    EditText nompet, comidafav, Noid;
    RadioGroup tipe;
    RadioButton perro, gato;
    Button back, agregar;
    CheckBox banho, veteri, caminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);
        Noid = findViewById(R.id.Noid);
        nompet = findViewById(R.id.nompet);
        comidafav = findViewById(R.id.comidafav);
        tipe = findViewById(R.id.tipe);
        perro = findViewById(R.id.dog);
        gato = findViewById(R.id.cat);
        back = findViewById(R.id.back);
        agregar = findViewById(R.id.agregar);
        banho = findViewById(R.id.limpio);
        veteri = findViewById(R.id.veteri);
        caminar = findViewById(R.id.caminar);
        comida = findViewById(R.id.comida);
        comidatipo = findViewById(R.id.comidatipo);

        ArrayAdapter unidadesArray = ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
        comidatipo.setAdapter(unidadesArray);
        comidatipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> lista, View view, int pos, long id) {
                if (lista.getItemAtPosition(pos).equals("secos")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(Altas.this, R.array.secos, android.R.layout.simple_list_item_1);
                    comida.setAdapter(listaAdapter);
                }else if(lista.getItemAtPosition(pos).equals("semihumedos")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(Altas.this, R.array.semihumedos, android.R.layout.simple_list_item_1);
                    comida.setAdapter(listaAdapter);
                }else if(lista.getItemAtPosition(pos).equals("enlatados")){
                    ArrayAdapter listaAdapter = ArrayAdapter.createFromResource(Altas.this, R.array.enlatados, android.R.layout.simple_list_item_1);
                    comida.setAdapter(listaAdapter);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> AdapterView) {
            }
        });
    }
    public void Back(View view){
        Intent intento = new Intent(Altas.this, MainActivity.class);
        startActivity(intento);
    }

    public void Agregar(View view){
        basecita svt = new basecita(Altas.this, "basecita", null, 1);
        SQLiteDatabase bd = svt.getWritableDatabase();
        boolean dog = perro.isChecked();
        boolean cat = gato.isChecked();
        String name = nompet.getText().toString();
        String fav = comidafav.getText().toString();
        int seleccionado = comidatipo.getSelectedItemPosition();
        String tipocomida = comidatipo.getSelectedItem().toString();
        int seleccionado2 = comida.getSelectedItemPosition();
        String comidita = comida.getSelectedItem().toString();
        boolean limpio = banho.isChecked();
        boolean veterina = veteri.isChecked();
        boolean camin = caminar.isChecked();
        int cod = Integer.parseInt(Noid.getText().toString());
        if (!name.equals("") && !fav.equals("") && !tipocomida.equals("") && !comidita.equals("")){
            ContentValues registro = new ContentValues();
            registro.put("codigo ", cod);
            registro.put("perro ", dog);
            registro.put("gato ", cat);
            registro.put("name ", name);
            registro.put("comidafav ", fav);
            registro.put("tipocomida ", tipocomida);
            registro.put("comidaidk ", comidita);
            registro.put("baño ", limpio);
            registro.put("goveteri ", veterina);
            registro.put("walk ", camin);
            bd.insert("basecita", null, registro);
            bd.close();
            Toast.makeText(this, "agregado", Toast.LENGTH_LONG).show();
            Intent intento = new Intent(Altas.this, MainActivity.class);
            startActivity(intento);
        }
    }
}