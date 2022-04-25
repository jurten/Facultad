package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;

public class Reserva {
    private DateLapse periodo;
    private Usuario inquilino;

    public Reserva(DateLapse periodo, Usuario inquilino) {
        this.periodo = periodo;
        this.inquilino = inquilino;
    }

    public boolean overlaps(DateLapse periodo){
        return this.periodo.overlaps(periodo);
    }

    public double total(double precio){
        return periodo.sizeInDays()*precio;
    }

    public boolean esDespuesDeHoy(){
        return periodo.getFrom().isAfter(LocalDate.now());
    }

    public void autoBorrado(){
        this.inquilino.borrar(this);
    }
}
