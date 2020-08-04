package com.example.activitylifecircle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*
Un activity es una "ventana" de nuestra aplicación. En algunos casos se pueden crear ventanas sin ser activities. 
El MainActivity es donde está la lógica de la ventana.

Un context es una parte de un activity, todo activity tiene un context. 
*/