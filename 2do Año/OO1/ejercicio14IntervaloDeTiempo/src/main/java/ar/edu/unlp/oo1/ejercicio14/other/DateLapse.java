package ar.edu.unlp.oo1.ejercicio14.other;

import ar.edu.unlp.oo1.ejercicio14.impl.ImportanMethodes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateLapse implements ImportanMethodes {
    private LocalDate from;
    private int sizeInDays;

    public DateLapse(LocalDate from, LocalDate to) {
        this.from = from;
        this.sizeInDays = (int) DAYS.between(from,to);
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return from.plusDays(sizeInDays);
    }

    public int sizeInDays(){
        return sizeInDays;
    }

    public boolean includesDate(LocalDate check){
        return check.isAfter(from) && check.isBefore(getTo());
    }
}
