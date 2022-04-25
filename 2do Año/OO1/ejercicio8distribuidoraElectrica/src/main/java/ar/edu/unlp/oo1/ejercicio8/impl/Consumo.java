package ar.edu.unlp.oo1.ejercicio8.impl;

import java.time.LocalDate;

public class Consumo {
    private LocalDate fecha;
    private double consumoEnergiaActiva;
    private double consumoEnergiaReactiva;

    public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
        this.fecha = fecha;
        this.consumoEnergiaActiva = consumoEnergiaActiva;
        this.consumoEnergiaReactiva = consumoEnergiaReactiva;
    }

    public double costoEnBaseA(double precioKWh){
        return consumoEnergiaActiva*precioKWh;
    }

    public double factorDePotencia(){
        return consumoEnergiaActiva/Math.hypot(consumoEnergiaActiva,consumoEnergiaReactiva);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getConsumoEnergiaActiva() {
        return consumoEnergiaActiva;
    }
}
