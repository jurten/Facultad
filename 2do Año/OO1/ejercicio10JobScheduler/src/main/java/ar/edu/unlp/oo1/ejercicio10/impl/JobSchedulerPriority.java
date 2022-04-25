package ar.edu.unlp.oo1.ejercicio10.impl;

import java.util.Comparator;

public class JobSchedulerPriority extends JobScheduler{


    @Override
    public JobDescription next() {
        JobDescription job = this.jobs.stream().max(Comparator.comparingInt(JobDescription::getPriority)).orElse(null);
        this.unschedule(job);
        return job;
    }
}
