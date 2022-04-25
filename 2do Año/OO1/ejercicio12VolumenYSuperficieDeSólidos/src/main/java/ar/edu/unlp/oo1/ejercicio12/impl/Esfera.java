package ar.edu.unlp.oo1.ejercicio12.impl;

public class Esfera extends Pieza{
    private double radio;

    public Esfera() {
    }

    public Esfera(String material, String color, double radio) {
        super(material, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double volumen(){
        return (1.333)*Math.PI*Math.pow(getRadio(),3);
    }

    public double superficie(){
        return 4*Math.PI*Math.pow(getRadio(),2);
    }
}
