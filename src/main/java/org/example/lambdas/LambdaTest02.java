package org.example.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> natus = List.of("Natus", "Naruto");
        List<Integer> integerList = map(natus, (String s) -> s.length());
        List<String> map = map(natus, String::toUpperCase);
        System.out.println(integerList);
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
