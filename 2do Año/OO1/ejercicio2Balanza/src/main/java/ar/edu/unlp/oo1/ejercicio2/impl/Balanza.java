package ar.edu.unlp.oo1.ejercicio2.impl;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private List<Producto> listadoProductos;

    public Balanza() {
        this.listadoProductos = new ArrayList();
    }

    public void ponerEnCero() {
        this.listadoProductos = new ArrayList();
    }
    public int getCantidadDeProductos(){
        return this.listadoProductos.size();
    }

    public double getPesoTotal(){
        return this.listadoProductos.stream().mapToDouble(Producto::getPeso).sum();
    }
    public double precioTotal(){
        return this.listadoProductos.stream().mapToDouble(Producto::getPrecio).sum();
    }
    public void agregarProducto(Producto  producto) {
        this.listadoProductos.add(producto);
    }
    public Ticket emitirTicket(){
        return new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.precioTotal());
    }
}
