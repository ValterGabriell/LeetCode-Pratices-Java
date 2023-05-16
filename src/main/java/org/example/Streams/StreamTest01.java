package org.example.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest01 {

    public static void main(String[] args) {
        List<LightNovels> lightNovels = new ArrayList<>(List.of(
                new LightNovels("avenida brasil", 16.8),
                new LightNovels("a favortita", 14.58),
                new LightNovels("caminho das indias", 11.0),
                new LightNovels("chocolate com pimenta", 15.5),
                new LightNovels("amor e paixao", 20.3)
        ));

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovels::getTitle))
                .filter(ln -> ln.getPrice() <= 15)
                .limit(3)
                .map(LightNovels::getTitle)
                .toList();
        System.out.println(titles);
    }
}
