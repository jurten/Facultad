package ar.edu.unlp.oo1.ejercicio6.impl;

import java.util.List;

public class Farola {
    private boolean encendida;
    private List<Farola> redAlumbrado;

    public Farola() {
        this.encendida = false;
    }


    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void pairWithNeighbor(Farola otraFarola) {
        this.redAlumbrado.add(otraFarola);
        this.addNeighbor(otraFarola);
    }

    private void addNeighbor(Farola otraFarola){
        otraFarola.redAlumbrado.add(this);
    }

    public List<Farola> getNeighbors() {
        return this.redAlumbrado;
    }

    public boolean isOn(){
        return this.encendida;
    }

    public void turnOn(){
        this.changeState();
    }

    public void turnOff(){
        this.changeState();
    }

    private void changeState(){
        this.setEncendida(!(this.isOn()));
        this.getNeighbors().stream().forEach(farola -> farola.isOn()?farola.turnOff():farola.turnOn());
    }
}
