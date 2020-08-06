package com.example.seccion01;

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

    /*
    Ejemplo de detección de Botón
     */
    public void miBoton(View v){
        int a = 5;
        Toast.makeText(this, "Hola desde mi boton", Toast.LENGTH_LONG).show();
    }

}
