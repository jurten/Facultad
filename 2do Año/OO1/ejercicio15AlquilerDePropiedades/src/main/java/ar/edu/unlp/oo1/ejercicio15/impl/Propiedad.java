package ar.edu.unlp.oo1.ejercicio15.impl;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String nombre;
    private String descripcion;
    private double precioPorNoche;
    private String direccion;
    private List<Reserva> reservas;

    public Propiedad(String nombre, String descripcion, double precioPorNoche, String direccion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioPorNoche = precioPorNoche;
        this.direccion = direccion;
        this.reservas = new ArrayList<Reserva>();
    }

    public Reserva hacerReserva(DateLapse periodo, Usuario inquilino){
        if (this.disponibilidad(periodo)) {
            Reserva reser = new Reserva(periodo, inquilino);
            this.reservas.add(reser);
            inquilino.reservar(reser);
            return reser;
        }
        return null;
    }

    public void eliminarReserva(Reserva eliminar){
        if (eliminar.esDespuesDeHoy()){
            this.reservas.remove(eliminar);
            eliminar.autoBorrado();
        }
    }

    public boolean disponibilidad(DateLapse periodo){
        return (!(this.reservas.stream().anyMatch(reserv -> reserv.overlaps(periodo))));
    }

    public double calcularGanacias(DateLapse periodo){
        return this.reservas.stream().filter(reserv -> reserv.overlaps(periodo)).mapToDouble(reserv -> reserv.total(precioPorNoche)).sum();
    }

}
