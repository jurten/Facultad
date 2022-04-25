package ar.edu.unlp.oo1.ejercicio13.impl;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo implements Recibible, Buscable, Ocupable{
    private List<Carpeta> carpetas;
    private Carpeta inbox = new Carpeta("inbox");

    public ClienteDeCorreo() {
        this.carpetas = new ArrayList<Carpeta>();
        this.agregar(inbox);
    }

    public void agregar(Carpeta agregada) {
        carpetas.add(agregada);
    }

    @Override
    public Email buscar(String texto) {
        return carpetas.stream().filter(folder -> folder.contieneMail(texto)).findFirst().orElse(null).buscar(texto);
    }

    @Override
    public int espacioOcupado() {
        return carpetas.stream().mapToInt(folder -> folder.espacioOcupado()).sum();
    }

    @Override
    public void recibir(Email email) {
       inbox.recibir(email);
    }

    public void mover(Email email, Carpeta origen, Carpeta destino){
        origen.borrar(email);
        destino.recibir(email);
    }
}
