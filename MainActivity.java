package com.example.activitylifecircle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        System.out.println("onDestroy");
        super.onDestroy();
    }

    @Override protected void onStart(){
        System.out.println("onStart");
        super.onStart();
    }

    @Override protected void onPause(){
        System.out.println("onPause");
        super.onPause();
    }

    @Override protected void onStop(){
        System.out.println("onStop");
        super.onStop();
    }

}

/*
Un activity es una "ventana" de nuestra aplicación. En algunos casos se pueden crear ventanas sin ser activities. 
El MainActivity es donde está la lógica de la ventana.
Un activity sólo puede tener un context.

Un context es una parte de un activity, todo activity tiene un context. 
*/