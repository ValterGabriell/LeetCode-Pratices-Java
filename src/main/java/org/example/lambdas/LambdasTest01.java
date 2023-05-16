package org.example.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
    public static void main(String[] args) {
        List<String> valter = List.of("Valter", "Gabriel");
        forEach(valter, s -> {
            System.out.println(s);
        });
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
