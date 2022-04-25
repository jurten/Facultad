package ar.edu.unlp.oo1.ejercicio14.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements ImportanMethodes{
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int sizeInDays(){
        return (int) from.until(to, ChronoUnit.DAYS);
    }

    public boolean includesDate(LocalDate check){
        return check.isAfter(from) && check.isBefore(to);
    }

    public boolean overlaps(DateLapse check){
        return this.includesDate(check.from) && this.includesDate(check.to);
    }
}
