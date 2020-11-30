package com.example.proyectoavanze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btn_login).setOnClickListener(this);
        findViewById(R.id.btn_reg_1).setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_reg_1:
                Intent intent = new Intent(getApplicationContext(), RegistroActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_login:
                Toast.makeText(getApplicationContext(), "La cuenta no es valida", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}