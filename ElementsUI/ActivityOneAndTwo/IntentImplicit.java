package com.example.seccion01;

import androidx.appcompat.app.AppCompatActivity;

package com.example.seccion01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class IntentImplicit extends AppCompatActivity {

    private EditText editTextPhone;
    private EditText editTextName;
    private ImageButton imgBtnPhone;
    private ImageButton imgBtnName;
    private ImageButton imgBtnCamera;
    private final static int PHONE_CALL_CODE = 100;

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
                    //comprobar versión actual de android
                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                        requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, PHONE_CALL_CODE);
                    } else {
                        olderVersions(phoneNumber);
                    }
                }
            }

            private void olderVersions(String phoneNumber){
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneNumber));
                if(CheckPermissions(Manifest.permission.CALL_PHONE)){
                    startActivity(intent);
                } else {
                    Toast.makeText(IntentImplicit.this, "You decline the access", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PHONE_CALL_CODE:
                String permission = permissions[0];
                int result = grantResults[0];

                if(permission.equals(Manifest.permission.CALL_PHONE)){
                    //Comprobar si ha sido aceptado o no la petición
                    if(result == PackageManager.PERMISSION_GRANTED){
                        String phoneNumber = editTextPhone.getText().toString();
                        Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneNumber));
                        startActivity(intentCall);
                    }
                }
                break;
        }
    }

    /*
        Revisamos los permisos de la aplicación
         */
    private boolean CheckPermissions(String permission){
        int result = this.checkCallingOrSelfPermission(permission);
        return result == PackageManager.PERMISSION_GRANTED;
    }
}
