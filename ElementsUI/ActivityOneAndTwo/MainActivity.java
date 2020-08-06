package com.example.seccion01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String message = "Hello to activity two";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonGoNext); //Este método regresa una "view"
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Acceder a nuevo activity y mandarle un string
                 */
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                //primer parametro -> id con el que accederemos a el desde el nuevo activty
                //segundo parametro -> valor que se está mandando ligado a ese ID
                intent.putExtra("Hello", message);
                startActivity(intent);
            }
        });
    }
}
