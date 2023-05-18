package org.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        List<String> collect = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).collect(Collectors.toList());


    }
}
