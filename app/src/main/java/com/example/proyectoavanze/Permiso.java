package com.example.proyectoavanze;

public class Permiso {


    private String nombre;


    public Permiso (String nombre) { //CONTRUCTOR QUE RECIBE LAS VARIABLES DE ARRIBA
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
