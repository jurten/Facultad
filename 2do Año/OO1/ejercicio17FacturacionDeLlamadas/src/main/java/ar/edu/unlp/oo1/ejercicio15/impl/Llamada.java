package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;

public abstract class Llamada {
    protected LocalDate fecha;
    protected int horaDeComienzo;
    protected int duracion;
    protected int telefonoLlamador;
    protected int telefonoReceptor;

    public Llamada(LocalDate fecha, int horaDeComienzo, int duracion, int telefonoLlamador, int telefonoReceptor) {
        this.fecha = fecha;
        this.horaDeComienzo = horaDeComienzo;
        this.duracion = duracion;
        this.telefonoLlamador = telefonoLlamador;
        this.telefonoReceptor = telefonoReceptor;
    }

    public abstract double calcularPrecio(double precio);
}
