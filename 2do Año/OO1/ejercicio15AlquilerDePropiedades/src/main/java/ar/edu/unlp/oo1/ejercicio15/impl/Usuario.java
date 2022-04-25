package ar.edu.unlp.oo1.ejercicio15.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
    private String nombre;
    private String direccion;
    private int dni;
    private List<Propiedad> propiedades;
    private List<Reserva> reservas;

    public Usuario(String nombre, String direccion, int dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.propiedades = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void reservar(Reserva res){
        this.reservas.add(res);
    }

    public void borrar(Reserva borrar){
        this.reservas.remove(borrar);
    }

    public Propiedad registrarPropiedad(String nombre, String descrpcion, double precio, String direccion){
        Propiedad property = new Propiedad(nombre,descrpcion,precio,direccion);
        this.propiedades.add(property);
        return property;
    }

    public List<Propiedad> estanLibres(DateLapse periodo){
        return this.propiedades.stream().filter(property -> property.disponibilidad(periodo)).collect(Collectors.toList());
    }

    public double calcularLosIngresos(DateLapse periodo){
        return this.propiedades.stream().mapToDouble(property -> property.calcularGanacias(periodo)).sum();
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
