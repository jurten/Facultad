package ar.edu.unlp.oo1.ejercicio4.impl;

public class Circulo implements Cara{
    private double radio;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro(){
        return this.getRadio()*2;
    }

    public void setDiametro(double diametro){
        this.setRadio(diametro/2);
    }

    public double getPerimetro(){
        return this.getDiametro()*Math.PI;
    }

    public double getArea(){
        return Math.pow(this.getRadio(),2)*Math.PI;
    }
}
