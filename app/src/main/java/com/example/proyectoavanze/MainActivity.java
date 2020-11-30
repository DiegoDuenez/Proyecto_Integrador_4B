package com.example.proyectoavanze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_ASK_PERMISSION = 124;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ANIMACIÓN DEL SPLASH
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int permisoLlamar = ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE);
                int permisoContactos = ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_CONTACTS);
                if(permisoLlamar != PackageManager.PERMISSION_GRANTED || permisoContactos != PackageManager.PERMISSION_GRANTED){
                    Intent i = new Intent(MainActivity.this, PermisosActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        }, 2000);


    }




}