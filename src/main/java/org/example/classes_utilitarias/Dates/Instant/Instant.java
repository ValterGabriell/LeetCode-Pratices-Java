package org.example.classes_utilitarias.Dates.Instant;

public class Instant {
    public static void main(String[] args) {
        java.time.Instant now = java.time.Instant.now();
        //zulu time é horario padrao pro mundo, facilita para fazer calulos de horarios
        System.out.println(now);
    }
}
