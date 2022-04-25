package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;

public class LlamadaLocal extends Llamada{


    public LlamadaLocal(LocalDate fecha, int horaDeComienzo, int durecion, int telefonoLlamador, int telefonoReceptor) {
        super(fecha, horaDeComienzo, durecion, telefonoLlamador, telefonoReceptor);
    }

    @Override
    public double calcularPrecio(double precio) {
        return duracion*precio;
    }
}
