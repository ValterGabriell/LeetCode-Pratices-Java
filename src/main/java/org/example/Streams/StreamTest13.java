package org.example.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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

        Map<Promotion, List<LightNovels>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        Map<Category, Map<Promotion, List<LightNovels>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovels::getCategory
                        , Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));


        System.out.println(collect1);


    }
}
