package ar.edu.unlp.oo1.ejercicio8.impl;

import java.time.LocalDate;

public class Factura {
    private double montoEnergiaActiva;
    private double descuento;
    private LocalDate fecha;
    private Usuario usuario;

    public Factura(double descuento, double montoEnergiaActiva, Usuario usuario) {
        this.montoEnergiaActiva = montoEnergiaActiva;
        this.descuento = descuento;
        this.fecha = LocalDate.now();
        this.usuario = usuario;
    }

    public Factura(double monto) {
        this.montoEnergiaActiva = monto;
    }

    public double getMontoEnergiaActiva() {
        return montoEnergiaActiva;
    }

    public void setMontoEnergiaActiva(double montoEnergiaActiva) {
        this.montoEnergiaActiva = montoEnergiaActiva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = 0.9;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double montoTotal(){
        return usuario.ultimoConsumoActiva().factorDePotencia()>0.8?montoEnergiaActiva*descuento:montoEnergiaActiva;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }
}
