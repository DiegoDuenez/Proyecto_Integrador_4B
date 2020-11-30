package com.example.proyectoavanze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PermisosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permisos);

        RecyclerView recyclerView = findViewById(R.id.recview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        Toast.makeText(this, "Acepta los permisos para poder continuar", Toast.LENGTH_LONG).show();


        List<Permiso> permisosList = new ArrayList<>();
        permisosList.add(new Permiso("prueba titulo 1"));

        AdaptadorPermisos adapter = new AdaptadorPermisos(permisosList);


        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();


    }
}