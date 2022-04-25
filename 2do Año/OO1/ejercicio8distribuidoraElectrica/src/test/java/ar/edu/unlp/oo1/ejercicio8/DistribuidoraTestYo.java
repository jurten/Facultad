package ar.edu.unlp.oo1.ejercicio8;

import ar.edu.unlp.oo1.ejercicio8.impl.Consumo;
import ar.edu.unlp.oo1.ejercicio8.impl.Distribuidora;
import ar.edu.unlp.oo1.ejercicio8.impl.Factura;
import ar.edu.unlp.oo1.ejercicio8.impl.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.naming.CompositeName;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DistribuidoraTestYo {
    private Distribuidora dist;
    private Usuario usr;
    private Consumo con;

    @BeforeEach
    void setUp() throws Exception{
        this.dist = new Distribuidora(50d);
        this.usr = new Usuario();
        this.con = new Consumo(LocalDate.now(),100,100);
        this.usr.agregarMedicion(con);

        this.dist.agregarUsuario(this.usr);
    }

    @Test
    void testAgregarUsuario() {
        assertNotEquals(new ArrayList<Factura>(),this.dist.facturar());
    }

    @Test
    void testEmitirFacturas() {
        assertNotEquals(new ArrayList<Factura>(),this.dist.facturar());
    }

    @Test
    void testCalcularConsumoTotal(){
        assertEquals(100,this.dist.consumoTotalActiva());
    }

}
