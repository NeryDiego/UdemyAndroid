package com.example.seccion01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textViewMain2);
        //Tomamos los datos del intent (los enviados desde el activity 1)
        Bundle bundle = getIntent().getExtras();
        //Revisamos que el bundle no este vacío
        if(bundle != null){
            String messageRecieve = bundle.getString("Hello");
            Toast.makeText(MainActivity2.this, "Pude leer el mensaje del activity 1!!", Toast.LENGTH_LONG).show();
            textView.setText(messageRecieve);
        } else {
            System.out.println("No se recibio ningun mensaje");
        }
    }
}
