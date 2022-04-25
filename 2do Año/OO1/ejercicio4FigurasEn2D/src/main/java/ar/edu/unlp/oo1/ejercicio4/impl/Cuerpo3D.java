package ar.edu.unlp.oo1.ejercicio4.impl;

public class Cuerpo3D {
    private double altura;
    private Cara cara;

    public Cuerpo3D() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setCaraBasal(Cara cara){
        this.cara = cara;
    }

    public double getVolumen(){
        return this.cara.getArea()*this.getAltura();
    }

    public double getSuperficieExterior(){
        return 2*this.cara.getArea()+this.cara.getPerimetro()*this.getAltura();
    }
}
