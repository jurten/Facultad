package ar.edu.unlp.oo1.ejercicio13.impl;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> archivos;

    public Email(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.archivos = new ArrayList<Archivo>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public boolean contiene(String texto) {
        return this.getTitulo().contains(texto) || this.getCuerpo().contains(texto);
    }

    public void adjuntar(Archivo adjunto){
        archivos.add(adjunto);
    }

    public int tamanioTotal() {
        return archivos.stream().mapToInt(file -> file.tamanio()).sum();
    }

    public List<Archivo> adjuntos(){
        return archivos;
    }
}
