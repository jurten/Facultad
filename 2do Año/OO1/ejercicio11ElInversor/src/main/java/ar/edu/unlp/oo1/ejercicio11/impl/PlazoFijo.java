package ar.edu.unlp.oo1.ejercicio11.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
    private LocalDate fechaDeConstitucion;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;

    public PlazoFijo() {
    }

    public LocalDate getFechaDeConstitucion() {
        return fechaDeConstitucion;
    }

    public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
        this.fechaDeConstitucion = fechaDeConstitucion;
    }

    public double getMontoDepositado() {
        return montoDepositado;
    }

    public void setMontoDepositado(double montoDepositado) {
        this.montoDepositado = montoDepositado;
    }

    public double getPorcentajeDeInteresDiario() {
        return porcentajeDeInteresDiario;
    }

    public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

    public double ganancias(){
        int periodo;
        periodo = (int) ChronoUnit.DAYS.between(LocalDate.now(),fechaDeConstitucion);
        return (montoDepositado+(montoDepositado*porcentajeDeInteresDiario))*periodo;
    }
}
