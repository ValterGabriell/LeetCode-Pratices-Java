package org.example.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest11 {
    public static void main(String[] args) {
        List<LightNovels> lightNovels = new ArrayList<>(List.of(
                new LightNovels("avenida brasil", 8.99),
                new LightNovels("a favortita", 10.99),
                new LightNovels("caminho das indias", 5.99),
                new LightNovels("chocolate com pimenta", 2.99),
                new LightNovels("chocolate com pimenta", 5.99),
                new LightNovels("amor e paixao", 1.99),
                new LightNovels("amor e paixao", 1.99),
                new LightNovels("montogari", 4.00)
        ));
    }
}
