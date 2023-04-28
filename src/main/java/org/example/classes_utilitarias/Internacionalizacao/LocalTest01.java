package org.example.classes_utilitarias.Internacionalizacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        //ISO 639 PRA LINGUA alpha 2 E iso 316 ALPHA 2 pra pais
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");

        Calendar calendar = Calendar.getInstance();
        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat format1 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);

        System.out.println("Italia " + format.format(calendar.getTime()));
        System.out.println("Suica " + format1.format(calendar.getTime()) + " " + localeCH.getDisplayCountry(localeItaly));

        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage: isoLanguages){
            System.out.println(isoLanguage + " ");
        }
        System.out.println();
        for (String isoCountry: isoCountries){
            System.out.println(isoCountry + " ");
        }

    }
}
