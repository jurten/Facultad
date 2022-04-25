package ar.edu.unlp.oo1.ejercicio8.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Distribuidora {
    private double precioKWh;
    private List<Usuario> usuarios;


    public Distribuidora(double precioKWh) {
        usuarios = new ArrayList<Usuario>();
        this.precioKWh = precioKWh;
    }

    public double getPrecioKW() {
        return precioKWh;
    }

    public void PrecioKWh(double precioKWh) {
        this.precioKWh = precioKWh;
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Factura> facturar(){
        return this.usuarios.stream().map(usuario -> usuario.facturarEnBaseA(precioKWh)).collect(Collectors.toList());
    }

    public double consumoTotalActiva(){
        return this.usuarios.stream().mapToDouble(user -> user.ultimoConsumoActiva().getConsumoEnergiaActiva()).sum();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
