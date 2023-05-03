package org.example.classes_utilitarias.Dates.LocalDateT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateT {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2022-06-15");
        LocalTime localTime = LocalTime.parse("09:45");
        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println(localDateTime);
    }
}
