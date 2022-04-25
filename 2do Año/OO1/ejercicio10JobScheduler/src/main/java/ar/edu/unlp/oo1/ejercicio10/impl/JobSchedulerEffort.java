package ar.edu.unlp.oo1.ejercicio10.impl;

import java.util.Comparator;

public class JobSchedulerEffort extends JobScheduler{

    @Override
    public JobDescription next() {
        JobDescription job = this.jobs.stream().max(Comparator.comparingDouble(JobDescription::getEffort)).orElse(null);
        this.unschedule(job);
        return job;
    }
}
