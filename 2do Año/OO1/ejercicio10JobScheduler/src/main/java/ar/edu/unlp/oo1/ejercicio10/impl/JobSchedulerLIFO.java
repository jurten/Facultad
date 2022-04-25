package ar.edu.unlp.oo1.ejercicio10.impl;

public class JobSchedulerLIFO extends JobScheduler{


    @Override
    public JobDescription next() {
        JobDescription job = this.jobs.get(this.jobs.size()-1);
        this.unschedule(job);
        return job;
    }
}
