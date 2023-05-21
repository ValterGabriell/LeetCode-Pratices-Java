package org.example.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        List<LightNovels> lightNovels = new ArrayList<>(List.of(
                new LightNovels("avenida brasil", 1.8),
                new LightNovels("a favortita", 14.58),
                new LightNovels("caminho das indias", 11.0),
                new LightNovels("chocolate com pimenta", 15.5),
                new LightNovels("chocolate com pimenta", 15.5),
                new LightNovels("amor e paixao", 20.3)
        ));
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).sorted(Comparator.comparing(LightNovels::getPrice).reversed()) .findFirst().ifPresent(System.out::println);


    }
}
