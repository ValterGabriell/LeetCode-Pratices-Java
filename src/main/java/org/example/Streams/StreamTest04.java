package org.example.Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> grapichDesigners = List.of("Wildnei Suane", "Catarina Santos");
        List<String> stringDevelopers = List.of("Willian", "David");
        List<String> students = List.of("Gustavo", "Épipo");
        devdojo.add(grapichDesigners);
        devdojo.add(stringDevelopers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);


    }
}
