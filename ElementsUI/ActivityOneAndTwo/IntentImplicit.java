package com.example.seccion01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class IntentImplicit extends AppCompatActivity {

    private EditText editTextPhone;
    private EditText editTextName;
    private ImageButton imgBtnPhone;
    private ImageButton imgBtnName;
    private ImageButton imgBtnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        editTextName = (EditText) findViewById(R.id.editTextTextPersonName);
        imgBtnPhone = (ImageButton) findViewById(R.id.imageTextPhone);
        imgBtnName = (ImageButton) findViewById(R.id.imageTextPersonName);
        imgBtnCamera = (ImageButton) findViewById(R.id.imageCamera);

        imgBtnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = editTextPhone.getText().toString();
                if(editTextPhone.getText() != null){
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneNumber));
                    startActivity(intent);
                }
            }
        });
    }
}
