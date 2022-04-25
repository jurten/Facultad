package ar.edu.unlp.oo1.ejercicio15;


import ar.edu.unlp.oo1.ejercicio15.impl.DateLapse;
import ar.edu.unlp.oo1.ejercicio15.impl.OOBnB;
import ar.edu.unlp.oo1.ejercicio15.impl.Propiedad;
import ar.edu.unlp.oo1.ejercicio15.impl.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;

public class OOBnBTest {
    private OOBnB airbnb;
    private Usuario juan;
    private Usuario pepe;
    private Propiedad casa;
    private Propiedad hotel;
    private Propiedad chalet;
    private DateLapse fecha1;
    private DateLapse fecha2;
    private DateLapse fecha3;
    private DateLapse fecha4;

    @BeforeEach
    public void setUp(){
        airbnb = new OOBnB();
        fecha1 = new DateLapse(LocalDate.of(1,1,2),LocalDate.of(1,1,3));
        fecha2 = new DateLapse(LocalDate.of(1,2,3),LocalDate.of(1,2,4));
        fecha3 = new DateLapse(LocalDate.of(5,5,5),LocalDate.of(6,6,6));
        fecha4 = new DateLapse(LocalDate.of(1,1,2),LocalDate.of(1,2,4));
        juan = airbnb.registrarUsuario("juan","2",2);
        pepe = airbnb.registrarUsuario("pepe","1",1);
        casa = juan.registrarPropiedad("casa","casa",10,"3");
        hotel = juan.registrarPropiedad("hotel","hotel",5,"4");
        chalet = juan.registrarPropiedad("chalet","chalet",15,"5");

        casa.hacerReserva(fecha1,pepe);
        hotel.hacerReserva(fecha2,pepe);
        chalet.hacerReserva(fecha3,pepe);

    }

    @Test
    public void testCalcularIngresos(){
        assertEquals(0,pepe.calcularLosIngresos(fecha4));
        assertEquals(15,juan.calcularLosIngresos(fecha4));
    }

}
