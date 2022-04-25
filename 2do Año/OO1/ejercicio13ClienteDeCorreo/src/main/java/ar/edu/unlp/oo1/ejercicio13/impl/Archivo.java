package ar.edu.unlp.oo1.ejercicio13.impl;

public class Archivo {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public int tamanio(){
        return nombre.length();
    }
}
