package ar.edu.unlp.oo1.ejercicio9.impl;

public class CajaDeAhorro extends Cuenta{

    @Override
    protected boolean puedeExtraer(double monto){
        return this.getSaldo()>=(monto*1.02);
    }

    @Override
    public boolean extraer(double monto){
        if (this.puedeExtraer(monto)) {
            super.extraer(monto);
            this.extraerSinControlar(monto * .02);
            return true;
        }
        return false;
    }


    @Override
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
        if (this.puedeExtraer(monto)){
            this.extraer(monto);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }
}
