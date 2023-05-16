package org.example.optionals;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("osadkajslkd");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("--------");
        Optional<String> willian = Optional.ofNullable(findName("Willian"));
        String s = willian.orElse("empty");
        willian.ifPresent(x -> System.out.println(x.toUpperCase()));

        System.out.println(s);
    }

    private static String findName(String name) {
        List<String> list = List.of("Willian", "Dev Dojo");
        int i = list.indexOf(name);
        if (i != -1) {
            return list.get(i);
        }
        return null;
    }
}
