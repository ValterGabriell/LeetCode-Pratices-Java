package org.example.Streams;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        list.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        Integer reduce = list.stream().reduce(0, Integer::sum);

        System.out.println(list.stream().reduce(10, (x, y) -> x * y));

        list.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        list.stream().reduce(0, Integer::max);
    }
}
