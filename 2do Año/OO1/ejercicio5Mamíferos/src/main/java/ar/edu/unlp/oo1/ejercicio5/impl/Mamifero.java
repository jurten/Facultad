package ar.edu.unlp.oo1.ejercicio5.impl;

import java.time.LocalDate;
import java.util.Objects;

public class Mamifero {
    private String nombre;
    private String identificador;
    private String especie;
    private LocalDate fecha;
    private Mamifero padre;
    private Mamifero madre;

    public Mamifero(String nombre) {
        this.nombre = nombre;
    }

    public Mamifero() {
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String id) {
        this.identificador = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getAbueloMaterno() {
        return this.getMadre()==null?null:this.getMadre().getPadre();
    }

    public void setAbueloMaterno(Mamifero abueloMaterno) {
        this.getMadre().setPadre(abueloMaterno);
    }

    public Mamifero getAbuelaMaterna() {
        return this.getMadre()==null?null:this.getMadre().getMadre();
    }

    public void setAbuelaMaterna(Mamifero abuelaMaterna){
        this.getMadre().setMadre(abuelaMaterna);
    }

    public Mamifero getAbueloPaterno(){
        return this.getPadre()==null?null:this.getPadre().getPadre();
    }

    public void setAbueloPaterno(Mamifero abueloPaterno){
        this.getPadre().setPadre(abueloPaterno);
    }

    public Mamifero getAbuelaPaterna(){
        return this.getPadre()==null?null:this.getPadre().getMadre();
    }

    public void setAbuelaPaterna(Mamifero abuelaPaterna){
        this.getPadre().setMadre(abuelaPaterna);
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        return (this.getPadre() != null && ((this.getPadre().equals(unMamifero)) || (this.getPadre().tieneComoAncestroA(unMamifero))))
                ||(this.getMadre() != null && ((this.getMadre().equals(unMamifero)) || (this.getMadre().tieneComoAncestroA(unMamifero))));
    }
}
