package com.example.a8botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void boton1(View boton1){
        Toast.makeText(this, "HOLA", Toast.LENGTH_SHORT).show();
    }
    public void boton2(View boton2){
        Toast.makeText(this, "ADIOS", Toast.LENGTH_SHORT).show();
    }
    public void boton3(View boton3){
        Toast.makeText(this, "REAUNUDAR", Toast.LENGTH_SHORT).show();
    }
    public void boton4(View boton4){
        Toast.makeText(this, "COMENTA", Toast.LENGTH_SHORT).show();
    }
    public void boton5(View boton5){
        Toast.makeText(this, "PAUSA", Toast.LENGTH_SHORT).show();
    }
    public void boton6(View boton6){
        Toast.makeText(this, "TERMINAR", Toast.LENGTH_SHORT).show();
    }
    public void boton7(View boton7){
        Toast.makeText(this, "CONTINUAR", Toast.LENGTH_SHORT).show();
    }
    public void boton8(View boton8){
        Toast.makeText(this, "SALIR", Toast.LENGTH_SHORT).show();
    }
}