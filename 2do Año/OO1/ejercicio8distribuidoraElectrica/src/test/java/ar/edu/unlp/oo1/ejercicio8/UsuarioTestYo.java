package ar.edu.unlp.oo1.ejercicio8;

import ar.edu.unlp.oo1.ejercicio8.impl.Consumo;
import ar.edu.unlp.oo1.ejercicio8.impl.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class UsuarioTestYo {
    private Usuario usr;
    private Consumo con;

    @BeforeEach
    void setUp() throws Exception{
        this.usr = new Usuario();
        this.con = new Consumo(LocalDate.now(),100,100);
        this.usr.agregarMedicion(con);
    }

   @Test
   void testAgregarConsumo() {
        assertNotNull(this.usr.ultimoConsumoActiva());
   }
}
