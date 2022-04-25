package ar.edu.unlp.oo1.ejercicio13.impl;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Recibible, Buscable, Ocupable{
    private List<Email> emails;
    private String nombre;

    public Carpeta(String nombre) {
        this.emails = new ArrayList<Email>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void borrar(Email borrado){
        emails.remove(borrado);
    }

    public boolean contieneMail(String texto) {
        return this.buscar(texto)!=null;
    }

    @Override
    public Email buscar(String texto) {
        return emails.stream().filter(email -> email.contiene(texto)).findFirst().orElse(null);
    }

    @Override
    public int espacioOcupado() {
        return emails.stream().mapToInt(email -> email.tamanioTotal()).sum();
    }

    @Override
    public void recibir(Email email) {
        emails.add(email);
    }
}
