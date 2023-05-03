package org.example.classes_utilitarias.Dates.Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period period = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofWeeks(58);
        System.out.println(p2);
    }
}
