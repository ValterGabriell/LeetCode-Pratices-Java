package org.example.youtube.map.HashSet;

import java.util.HashSet;

public class MainApp {

    public static void main(String[] args) {

        Book book1 = new Book("abc", "a");
        Book book3 = new Book("cbc", "c");
        Book book4 = new Book("dbc", "d");
        Book book2 = new Book("bbc", "b");
        Book book5 = new Book("bbc", "f");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(2);

        hashSet.forEach(System.out::println);

    }
}
