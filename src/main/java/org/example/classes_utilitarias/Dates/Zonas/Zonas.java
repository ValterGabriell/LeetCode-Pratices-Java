package org.example.classes_utilitarias.Dates.Zonas;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class Zonas {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant now1 = Instant.now();
        System.out.println(now1);
        ZonedDateTime zonedDateTime1 = now1.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = now1.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate from = JapaneseDate.from(LocalDate.now());
        System.out.println(from);

    }
}
