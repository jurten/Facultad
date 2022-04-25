package ar.edu.unlp.oo1.ejercicio15.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
    private List<Empleado> nomina;

    public Empresa() {
        this.nomina = new ArrayList<>();
    }

    public void darDeAltaEmpleado(String nombre, String apellido, int cuil, LocalDate fechaDeNacimiento, boolean conyugue, boolean hijos){
        Empleado agregar = new Empleado(nombre,apellido,cuil,fechaDeNacimiento,conyugue,hijos,LocalDate.now());
        this.nomina.add(agregar);
    }

    public Empleado buscarEmpleado(int cuil){
        return this.nomina.stream().filter(find -> find.getCuil()==cuil).findFirst().orElse(null);
    }

    public void darDeBajaEmpleado(Empleado empleado){
        this.nomina.remove(empleado);
    }

    public List<Empleado> obtenerEmpleadosContratoVencido(){
        return this.nomina.stream().filter(output -> output.esVencido()).collect(Collectors.toList());
    }

    public ReciboDeSueldo generarRecibosDeSueldo(){

    }

    public void cargarContrato(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int horas){

    }

    public void cargarContratoPlanta(Empleado empleado, LocalDate fechaInicio, double sueldoMensual, double montoConyuge, double montoConyuge){

    }
}
