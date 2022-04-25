package ar.edu.unlp.oo1.ejercicio15.impl;

public class PersonaFisica extends Persona{
    private int dni;

    public PersonaFisica(String nombre, String direccion, int telefono, int dni) {
        super(nombre, direccion, telefono);
        this.dni = dni;
    }

    @Override
    public double facturarLlamadas() {
        return (this.registro.stream().mapToDouble(call -> call.calcularPrecio(1)).sum())*0.9;
    }
}
