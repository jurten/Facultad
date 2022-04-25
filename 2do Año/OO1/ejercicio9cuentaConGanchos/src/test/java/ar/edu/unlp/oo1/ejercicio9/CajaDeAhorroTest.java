package ar.edu.unlp.oo1.ejercicio9;

import ar.edu.unlp.oo1.ejercicio9.impl.CajaDeAhorro;
import ar.edu.unlp.oo1.ejercicio9.impl.CuentaCorriente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CajaDeAhorroTest {
    private CajaDeAhorro caja;
    private CuentaCorriente cuenta;

    @BeforeEach
    public void setUp(){
        this.caja = new CajaDeAhorro();
        this.cuenta = new CuentaCorriente();
    }

    @Test
    void testTransferir(){
        this.caja.depositar(102);
        this.caja.transferirACuenta(100,cuenta);
        assertEquals(100,cuenta.getSaldo());
    }
}
