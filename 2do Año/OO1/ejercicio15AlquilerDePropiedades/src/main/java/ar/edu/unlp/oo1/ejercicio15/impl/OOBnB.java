package ar.edu.unlp.oo1.ejercicio15.impl;

import java.util.ArrayList;
import java.util.List;

public class OOBnB {
    private List<Usuario> usuarios;

    public OOBnB() {
        this.usuarios = new ArrayList<>();
    }

    public List<Propiedad> buscarDisponibles(DateLapse  periodo){
        List<Propiedad> out = new ArrayList<>();
        this.usuarios.stream().forEach(user -> out.addAll(user.estanLibres(periodo)));
        return out;
    }

    public Usuario registrarUsuario(String nombre, String direccion, int dni){
        Usuario user = new Usuario(nombre,direccion,dni);
        this.usuarios.add(user);
        return user;
    }
}
