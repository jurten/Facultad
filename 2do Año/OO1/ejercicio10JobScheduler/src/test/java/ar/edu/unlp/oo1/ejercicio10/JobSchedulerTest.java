package ar.edu.unlp.oo1.ejercicio10;

import ar.edu.unlp.oo1.ejercicio10.impl.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JobSchedulerTest {
    private JobScheduler fifo;
    private JobScheduler lifo;
    private JobScheduler prio;
    private JobScheduler effort;
    private JobDescription job0;
    private JobDescription job1;
    private JobDescription job2;
    private JobDescription job3;


    @BeforeEach
    private void setUp(){
       this.fifo = new JobSchedulerFIFO();
       this.lifo = new JobSchedulerLIFO();
       this.prio = new JobSchedulerPriority();
       this.effort = new JobSchedulerEffort();
       this.job0 = new JobDescription(0.5,1,"job0");
       this.job1 = new JobDescription(1.5,2,"job1");
       this.job2 = new JobDescription(2.5,3,"job2");
       this.job3 = new JobDescription(3.5,4,"job3");
    }

    @Test
    void testFifo(){
        this.fifo.schedule(job0);
        this.fifo.schedule(job1);
        this.fifo.schedule(job2);
        this.fifo.unschedule(job0);
        assertEquals(job1,this.fifo.next());
    }

    @Test
    void testLifo(){
        this.lifo.schedule(job0);
        this.lifo.schedule(job1);
        this.lifo.schedule(job2);
        this.lifo.unschedule(job2);
        assertEquals(job1,this.lifo.next());
    }

    @Test
    void testPrio(){
        this.prio.schedule(job0);
        this.prio.schedule(job1);
        this.prio.schedule(job2);
        this.prio.unschedule(job2);
        assertEquals(job1,this.prio.next());
    }

    @Test
    void testEffort(){
        this.effort.schedule(job0);
        this.effort.schedule(job1);
        this.effort.schedule(job2);
        this.effort.unschedule(job2);
        assertEquals(job1,this.effort.next());
    }
}
