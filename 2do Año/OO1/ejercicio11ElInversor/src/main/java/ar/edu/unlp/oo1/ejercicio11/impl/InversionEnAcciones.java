package ar.edu.unlp.oo1.ejercicio11.impl;

import java.util.List;

public class InversionEnAcciones implements Inversion{
    private String nombre;
    private int cantidad;
    private double valorUnitario;

    public InversionEnAcciones() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double ganancias(){
        return cantidad*valorUnitario;
    }
}
