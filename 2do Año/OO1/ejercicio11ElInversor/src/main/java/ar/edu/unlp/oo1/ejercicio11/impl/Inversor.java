package ar.edu.unlp.oo1.ejercicio11.impl;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
    private String nombre;
    private List<Inversion> inversiones;

    public Inversor() {
        this.inversiones = new ArrayList<Inversion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Inversion> getInversiones() {
        return inversiones;
    }

    public void setInversiones(List<Inversion> inversiones) {
        this.inversiones = inversiones;
    }

    public double valorActual(){
        return this.inversiones.stream().mapToDouble(profit -> profit.ganancias()).sum();
    }
}
