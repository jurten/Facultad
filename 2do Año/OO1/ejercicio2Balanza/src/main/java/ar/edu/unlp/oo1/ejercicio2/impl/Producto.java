package ar.edu.unlp.oo1.ejercicio2.impl;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripción) {
        this.descripcion = descripción;
    }

    public Producto() {
    }

    public Producto(double peso, double precioPorKilo, String descripción) {
        this.peso = peso;
        this.precioPorKilo = precioPorKilo;
        this.descripcion = descripción;
    }

    public double getPrecio(){
        return this.getPrecioPorKilo()*this.getPeso();
    }
}
