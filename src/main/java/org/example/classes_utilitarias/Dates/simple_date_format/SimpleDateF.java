package org.example.classes_utilitarias.Dates.simple_date_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateF {
    public static void main(String[] args) {
        String mask = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(mask);
        String formatted = sdf.format(new Date());
        System.out.println(formatted);
    }
}
