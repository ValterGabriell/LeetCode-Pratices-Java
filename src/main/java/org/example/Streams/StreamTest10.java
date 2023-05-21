package org.example.Streams;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10).forEach(Arrays::toString);

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextDouble(1, 540)).limit(10).forEach(System.out::println);
    }
}
