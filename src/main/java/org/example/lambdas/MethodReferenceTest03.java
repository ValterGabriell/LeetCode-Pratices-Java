package org.example.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;


public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> anime = new ArrayList<>(List.of("valter", "gabriel"));
        anime.sort(String::compareTo);
        System.out.println(anime);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkIfSomeNameExists = List::contains;
        System.out.println(checkIfSomeNameExists.test(anime, "gabriel"));
    }
}
