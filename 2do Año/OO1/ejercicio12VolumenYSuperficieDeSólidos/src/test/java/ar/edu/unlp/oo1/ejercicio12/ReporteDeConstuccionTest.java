package ar.edu.unlp.oo1.ejercicio12;

import ar.edu.unlp.oo1.ejercicio12.impl.Cilindro;
import ar.edu.unlp.oo1.ejercicio12.impl.Esfera;
import ar.edu.unlp.oo1.ejercicio12.impl.PrismaRectangular;
import ar.edu.unlp.oo1.ejercicio12.impl.ReporteDeConstruccion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReporteDeConstuccionTest {
    private ReporteDeConstruccion reporte;
    private Esfera e0,e1;
    private Cilindro c0,c1;
    private PrismaRectangular p0,p1;

    @BeforeEach
    public void setup() {
        this.reporte = new ReporteDeConstruccion();

        this.e0 = new Esfera("acero","rojo",10d);
        this.e1 = new Esfera("plomo","azul",5d);
        this.c0 = new Cilindro("acero","azul",5d,10d);
        this.c1 = new Cilindro("plomo","rojo",10d,10d);
        this.p0 = new PrismaRectangular("acero","verde",3,6,9);
        this.p1 = new PrismaRectangular("plomo","rojo",4,8,12);

        reporte.agregarConstrucciones(e0);
        reporte.agregarConstrucciones(e1);
        reporte.agregarConstrucciones(c0);
        reporte.agregarConstrucciones(c1);
        reporte.agregarConstrucciones(p0);
        reporte.agregarConstrucciones(p1);
    }

    @Test
    public void testVolumenDeMaterial(){
        assertEquals(5135.141170632642,reporte.volumenDeMaterial("acero"));
        assertEquals(4049.0605294941925,reporte.volumenDeMaterial("plomo"));
    }

    @Test
    public void testSuperficieDeColor(){
        assertEquals(238479.1426875805,reporte.superficieDeColor("rojo"));
    }
}
