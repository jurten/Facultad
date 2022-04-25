package ar.edu.unlp.oo1.ejercicio3.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> listado;

    public Presupuesto() {
        this.listado = new ArrayList<>();
    }

    public Presupuesto(LocalDate fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.listado = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public Presupuesto cliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public void agregarItem(Item item){
        this.listado.add(item);
    }

    public double calcularTotal(){
        return this.listado.stream().mapToDouble(Item::costo).sum();
    }
}
