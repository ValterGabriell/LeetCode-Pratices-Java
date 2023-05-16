package org.example.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest02 {
    public static void main(String[] args) {
        List<LightNovels> lightNovels = new ArrayList<>(List.of(
                new LightNovels("avenida brasil", 16.8),
                new LightNovels("a favortita", 14.58),
                new LightNovels("caminho das indias", 11.0),
                new LightNovels("chocolate com pimenta", 15.5),
                new LightNovels("chocolate com pimenta", 15.5),
                new LightNovels("amor e paixao", 20.3)
        ));
        Stream<LightNovels> stream = lightNovels.stream();
        long count = stream
                .filter(ln -> ln.getPrice() < 15)
                .count();
        System.out.println(count);
        lightNovels.forEach(System.out::println);


    }
}
