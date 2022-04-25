package ar.edu.unlp.oo1.ejercicio15.impl;

public class PersonaFiscal extends Persona{
    private int cuit;
    private String tipo;

    public PersonaFiscal(String nombre, String direccion, int telefono, int cuit, String tipo) {
        super(nombre, direccion, telefono);
        this.cuit = cuit;
        this.tipo = tipo;
    }

    @Override
    public double facturarLlamadas() {
        return this.registro.stream().mapToDouble(call -> call.calcularPrecio(1)).sum();
    }
}
