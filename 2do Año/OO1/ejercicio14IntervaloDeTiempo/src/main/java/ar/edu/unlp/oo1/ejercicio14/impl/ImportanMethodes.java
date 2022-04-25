package ar.edu.unlp.oo1.ejercicio14.impl;

import java.time.LocalDate;

public interface ImportanMethodes {
    public LocalDate getFrom();
    public LocalDate getTo();
    public int sizeInDays();
    public boolean includesDate(LocalDate check);
}
