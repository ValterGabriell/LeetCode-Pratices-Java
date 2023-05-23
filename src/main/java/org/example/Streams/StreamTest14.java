package org.example.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    public static void main(String[] args) {
        List<LightNovels> lightNovels = new ArrayList<>(List.of(
                new LightNovels("avenida brasil", 8.99, Category.DRAMA),
                new LightNovels("a favortita", 10.99, Category.DRAMA),
                new LightNovels("caminho das indias", 5.99, Category.FANTASY),
                new LightNovels("chocolate com pimenta", 2.99, Category.ROMANCE),
                new LightNovels("chocolate com pimenta", 5.99, Category.FANTASY),
                new LightNovels("amor e paixao", 1.99, Category.ROMANCE),
                new LightNovels("amor e paixao", 1.99, Category.DRAMA),
                new LightNovels("montogari", 4.00, Category.ROMANCE)
        ));
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovels::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovels>> collect1 = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(LightNovels::getCategory,
                                Collectors.maxBy(Comparator.comparing(LightNovels::getPrice))));
        System.out.println(collect1);
        Map<Category, LightNovels> collect2 = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(LightNovels::getCategory,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovels::getPrice)), Optional::get)));
    }
}
