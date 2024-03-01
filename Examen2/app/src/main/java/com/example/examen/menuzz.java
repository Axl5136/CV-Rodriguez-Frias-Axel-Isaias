package com.example.examen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class menuzz extends AppCompatActivity {

    EditText num1,num2;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menusitobb,menu);

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        int no1= Integer.parseInt(num1.getText().toString());
        int no2= Integer.parseInt(num2.getText().toString());

        if(item.getItemId()==R.id.palomita){
            Toast.makeText(this, "suma " + (no1+no2) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.suma){
            Toast.makeText(this, "suma " + (no1+no2) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.palomita2){
            Toast.makeText(this, "resta " + (no1-no2) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.resta){
            Toast.makeText(this, "resta " + (no1-no2) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.palomita3){
            Toast.makeText(this, "multiplicacion " + (no1*no2) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.multi){
            Toast.makeText(this, "multiplicacion " + (no1*no2) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.palomita4){
            Toast.makeText(this, "division " + (no1/no2) , Toast.LENGTH_SHORT).show();

        }
        if(item.getItemId()==R.id.divi){
            Toast.makeText(this, "division " + (no1/no2) , Toast.LENGTH_SHORT).show();

        }



        return super.onOptionsItemSelected(item);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuzz);




    }
}