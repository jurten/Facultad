package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;

public class LlamadaInterurbana extends Llamada{
    private double distancia;
    private double costoConexion;

    public LlamadaInterurbana(LocalDate fecha, int horaDeComienzo, int durecion, int telefonoLlamador, int telefonoReceptor, double distancia) {
        super(fecha, horaDeComienzo, durecion, telefonoLlamador, telefonoReceptor);
        this.distancia = distancia;
        this.costoConexion = 5;
    }

    @Override
    public double calcularPrecio(double precio) {
        if (distancia<100){
            precio=2;
            return  costoConexion+duracion*precio;
        }else {
            if ((distancia>=100)&&(distancia<500)){
                precio=2.5;
                return costoConexion+duracion*precio;
            }
            else{
                if (distancia>=500){
                    precio=3;
                    return costoConexion+ duracion*precio;
                }
            }
        }
        return 0;
    }
}
