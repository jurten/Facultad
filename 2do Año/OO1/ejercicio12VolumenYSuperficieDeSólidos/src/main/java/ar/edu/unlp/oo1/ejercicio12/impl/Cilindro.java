package ar.edu.unlp.oo1.ejercicio12.impl;

public class Cilindro extends Pieza{
    private double radio;
    private double altura;

    public Cilindro() {
    }

    public Cilindro(String material, String color, double radio, double altura) {
        super(material, color);
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double volumen() {
        return Math.PI*Math.pow(getRadio(),2)*getAltura();
    }

    @Override
    public double superficie() {
        return 2*Math.PI*radio*(getAltura()+2)*Math.PI*Math.pow(radio,2);
    }
}
