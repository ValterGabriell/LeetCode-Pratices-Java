package org.example.classes_utilitarias.Dates.Date;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //date trabalha em ms desde 1 de janeiro de 1970
        Date date = new Date(1_000_000_000_000L);
        System.out.println(date);
    }
}
