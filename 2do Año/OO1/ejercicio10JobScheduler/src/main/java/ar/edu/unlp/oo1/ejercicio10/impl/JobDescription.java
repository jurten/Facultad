package ar.edu.unlp.oo1.ejercicio10.impl;

public class JobDescription {
    private double effort;
    private int priority;
    private String description;

    public JobDescription(double effort, int priority, String description) {
        this.effort = effort;
        this.priority = priority;
        this.description = description;
    }

    public double getEffort() {
        return effort;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "JobDescription{" +
                "effort=" + effort +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }
}
