package ar.edu.unlp.oo1.ejercicio10.impl;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    protected List<JobDescription> jobs;

    public JobScheduler() {
        this.jobs = new ArrayList<JobDescription>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        this.jobs.remove(job);
    }

    public abstract JobDescription next();
}
