package org.example.classes_utilitarias.Dates.ChronoUnit;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUni {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2000, Month.JUNE, 25, 12, 0, 0);
        long days = ChronoUnit.DAYS.between(aniversario, LocalDateTime.now());
        long weeks = ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now());
        long months = ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now());
        long years = ChronoUnit.YEARS.between(aniversario, LocalDateTime.now());
        System.out.println(days);
        System.out.println(weeks);
        System.out.println(months);
        System.out.println(years);
    }
}
