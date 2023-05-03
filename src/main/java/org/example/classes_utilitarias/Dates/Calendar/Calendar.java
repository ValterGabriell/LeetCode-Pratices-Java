package org.example.classes_utilitarias.Dates.Calendar;

import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar c = java.util.Calendar.getInstance();
        if (c.getFirstDayOfWeek() == java.util.Calendar.SUNDAY){
            System.out.println("Prieiro dia da semana");;
        }
        System.out.println(c.get(java.util.Calendar.DAY_OF_MONTH));
        c.add(java.util.Calendar.DAY_OF_MONTH, 2);
        c.roll(java.util.Calendar.HOUR, 65);

        Date date = c.getTime();
        System.out.println(date);
    }
}
