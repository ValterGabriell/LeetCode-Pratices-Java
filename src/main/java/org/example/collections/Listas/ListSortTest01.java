package org.example.collections.Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Naruto");
        mangas.add("Dragon Ball");
        mangas.add("Bersek");
        mangas.add("Pokemon");
        mangas.add("Digimon");

        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}
