package ar.edu.unlp.oo1.ejercicio10.impl;

import java.util.Comparator;

public class JobSchedulerFIFO extends JobScheduler{


    @Override
    public JobDescription next() {
        JobDescription job = this.jobs.get(0);
        this.unschedule(job);
        return job;
    }
}
