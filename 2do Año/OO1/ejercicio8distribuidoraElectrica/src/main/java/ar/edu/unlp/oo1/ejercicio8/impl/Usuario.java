package ar.edu.unlp.oo1.ejercicio8.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Usuario {
    private String domicilio;
    private String Nombre;
    private List<Consumo> consumos;
    private List<Factura> facturas;

    public Usuario() {
        consumos = new ArrayList<Consumo>();
        facturas = new ArrayList<Factura>();
    }

    public Usuario(String domicilio, String nombre) {
        this.domicilio = domicilio;
        this.Nombre = nombre;
        consumos = new ArrayList<Consumo>();
        facturas = new ArrayList<Factura>();
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void agregarMedicion(Consumo medicion){
        this.consumos.add(medicion);
    }

    public Consumo ultimoConsumoActiva(){
        return this.consumos.stream().max(Comparator.comparing((consumo) -> consumo.getFecha())).orElse(null);
    }

    public Factura facturarEnBaseA(double precioKWh){
        if (ultimoConsumoActiva()!=null){
            Factura agregar = new Factura(precioKWh*this.ultimoConsumoActiva().getConsumoEnergiaActiva());
            this.facturas.add(agregar);
            return agregar;
        }else{
            return null;
        }

    }

    public List<Factura> facturas(){
        return this.facturas;
    }


}
