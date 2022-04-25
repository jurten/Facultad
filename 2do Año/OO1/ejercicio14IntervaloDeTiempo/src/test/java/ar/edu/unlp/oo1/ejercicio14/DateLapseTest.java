package ar.edu.unlp.oo1.ejercicio14;

import ar.edu.unlp.oo1.ejercicio14.other.DateLapse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class DateLapseTest {
    private DateLapse date;

    @BeforeEach
    public void setUp(){
        this.date = new DateLapse(LocalDate.of(1990,1,1),LocalDate.of(1990,1,3));
    }

    @Test
    public void testSizeInDays(){
        assertEquals(2,date.sizeInDays());
    }

    @Test
    public void testIncludesDate(){
        assertTrue(date.includesDate(LocalDate.of(1990,1,2)));
        assertFalse(date.includesDate(LocalDate.of(1990,1,4)));
    }
}
