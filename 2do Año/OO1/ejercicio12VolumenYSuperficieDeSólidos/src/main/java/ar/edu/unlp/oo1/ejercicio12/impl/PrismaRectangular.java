package ar.edu.unlp.oo1.ejercicio12.impl;

public class PrismaRectangular extends Pieza{
    private double ladoMayor;
    private double ladoMenor;
    private double altura;

    public PrismaRectangular() {
    }

    public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
        super(material, color);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
        this.altura = altura;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double volumen() {
        return getLadoMayor()*getLadoMenor()*getAltura();
    }

    @Override
    public double superficie() {
        return 2*((getLadoMayor()*getLadoMenor())+(getLadoMayor()*getAltura())+(getLadoMenor()*getAltura()));
    }
}
