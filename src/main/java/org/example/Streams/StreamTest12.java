package org.example.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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

        Map<Category, List<LightNovels>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovels::getCategory));
        System.out.println(collect);


    }
}
