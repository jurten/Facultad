package ar.edu.unlp.oo1.ejercicio12.impl;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
    private List<Pieza> construcciones;

    public ReporteDeConstruccion() {
        this.construcciones = new ArrayList<Pieza>();
    }

    public List<Pieza> getConstrucciones() {
        return construcciones;
    }

    public void setConstrucciones(List<Pieza> construcciones) {
        this.construcciones = construcciones;
    }

    public void agregarConstrucciones(Pieza nueva){
        this.construcciones.add(nueva);
    }

    public double volumenDeMaterial(String material){
        return this.construcciones.stream().mapToDouble(objeto -> objeto.esDelMaterial(material)?objeto.volumen():0).sum();
    }

    public double superficieDeColor(String color){
        return this.construcciones.stream().mapToDouble(objeto -> objeto.esDelColor(color)?objeto.superficie():0).sum();
    }
}
