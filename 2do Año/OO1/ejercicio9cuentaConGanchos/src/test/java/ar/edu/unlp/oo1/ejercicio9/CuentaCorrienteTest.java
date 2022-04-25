package ar.edu.unlp.oo1.ejercicio9;

import ar.edu.unlp.oo1.ejercicio9.impl.CuentaCorriente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaCorrienteTest {
    private CuentaCorriente cuenta1;
    private CuentaCorriente cuenta2;
    @BeforeEach
    public void setUp(){
        this.cuenta1 = new CuentaCorriente();
        this.cuenta2 = new CuentaCorriente();
    }

    @Test
    void testTranferir(){
        this.cuenta1.depositar(100);
        this.cuenta1.setDescubierto(100);
        this.cuenta1.transferirACuenta(200,cuenta2);
        assertEquals(200,this.cuenta2.getSaldo());
    }
}
