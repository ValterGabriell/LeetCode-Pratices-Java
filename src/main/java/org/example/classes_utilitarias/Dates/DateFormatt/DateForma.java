package org.example.classes_utilitarias.Dates.DateFormatt;

import java.text.DateFormat;
import java.util.Calendar;

public class DateForma {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        /*
        28/04/2023 10:23
        28 de abr. de 2023
        28 de abr. de 2023 10:23:18
        28/04/2023
        28 de abr. de 2023
        28 de abril de 2023
        sexta-feira, 28 de abril de 2023
         */
    }
}
