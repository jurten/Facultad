package ar.edu.unlp.oo1.ejercicio4.impl;

public class Cuadrado implements Cara{
    private double lado;

    public Cuadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro(){
        return this.getLado()*4;
    }

    public double getArea() {
        return this.getLado() * this.getLado();
    }
}
