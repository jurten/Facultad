package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected List<Llamada> registro;

    public Persona(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.registro = new ArrayList<>();
    }

    public abstract double facturarLlamadas();

    public Llamada registrarLlamadaLocal(LocalDate fecha, int hora, int duracion, int telefonoReceptor){
        Llamada call = new LlamadaLocal(fecha, hora, duracion, telefono, telefonoReceptor);
        this.registro.add(call);
        return call;
    }

    public Llamada registrarLlamadaInterurbana(LocalDate fecha, int hora, int duracion, int telefonoReceptor, int distancia){
        Llamada call = new LlamadaInterurbana(fecha,hora,duracion,telefono,telefonoReceptor,distancia);
        this.registro.add(call);
        return call;
    }

    public Llamada registrarLlamadaInternacional(LocalDate fecha, int hora, int duracion, int telefonoReceptor, String paisOrigen, String paisDestino){
        Llamada call = new LlamadaInternacional(fecha, hora, duracion, telefono, telefonoReceptor, paisOrigen, paisDestino);
        this.registro.add(call);
        return call;
    }
}
