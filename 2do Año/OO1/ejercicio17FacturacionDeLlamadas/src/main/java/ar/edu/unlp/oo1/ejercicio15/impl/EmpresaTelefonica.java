package ar.edu.unlp.oo1.ejercicio15.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmpresaTelefonica {
    private List<Persona> clientes;
    private LinkedList<Integer> telefonos;

    public EmpresaTelefonica() {
        this.clientes = new ArrayList<>();
        this.telefonos = new LinkedList<>();
    }

    public void agregarNumero(int agregar){
        this.telefonos.add(agregar);
    }

    public Persona darDeAltaPersonaFisica(String nom, String dir, int dni){
        int agregar = telefonos.poll();
        Persona person = new PersonaFisica(nom,dir,dni,agregar);
        this.clientes.add(person);
        return person;
    }

    public Persona darDeAltaPersonaFiscal(String nom, String dir, int cuit, String tipo){
        int agregar = telefonos.poll();
        Persona person = new PersonaFiscal(nom,dir,cuit,agregar,tipo);
        this.clientes.add(person);
        return person;
    }

}
