package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String apellido;
    private int cuil;
    private LocalDate fechaDeNacimiento;
    private boolean conyugue;
    private boolean hijos;
    private LocalDate fechaDeRelacion;

    public Empleado(String nombre, String apellido, int cuil, LocalDate fechaDeNacimiento, boolean conyugue, boolean hijos, LocalDate fechaDeRelacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.conyugue = conyugue;
        this.hijos = hijos;
        this.fechaDeRelacion = fechaDeRelacion;
    }

    public int getCuil() {
        return cuil;
    }
}
