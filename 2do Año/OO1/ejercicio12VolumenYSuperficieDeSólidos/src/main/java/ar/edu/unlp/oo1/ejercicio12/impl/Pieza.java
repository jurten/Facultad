package ar.edu.unlp.oo1.ejercicio12.impl;

public abstract class Pieza {
    private String material;
    private String color;

    public Pieza() {
    }

    public Pieza(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public abstract double volumen();

    public abstract double superficie();

    public boolean esDelMaterial(String material){
        return getMaterial().equals(material);
    }

    public boolean esDelColor(String color){
        return getColor().equals(color);
    }
}