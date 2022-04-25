package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;

public class LlamadaInternacional extends Llamada{
    private String paisOrigin;
    private String paisDestino;

    public LlamadaInternacional(LocalDate fecha, int horaDeComienzo, int durecion, int telefonoLlamador, int telefonoReceptor, String paisOrigin, String paisDestino) {
        super(fecha, horaDeComienzo, durecion, telefonoLlamador, telefonoReceptor);
        this.paisOrigin = paisOrigin;
        this.paisDestino = paisDestino;
    }

    @Override
    public double calcularPrecio(double precio) {
        if ((horaDeComienzo>=8)&&(horaDeComienzo<=20)){
            precio=4;
            return duracion*precio;
        }else{
            precio=3;
            return duracion*precio;
        }
    }
}
