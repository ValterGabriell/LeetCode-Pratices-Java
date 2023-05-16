package org.example.collections.HashSetSet;

import org.example.collections.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "Naruto", 15.4, 0));
        mangas.add(new Manga(5L, "Attack on titan", 19.9, 5));
        mangas.add(new Manga(6L, "Dragon Ball", 9.9, 3));
        mangas.add(new Manga(2L, "7 pecados", 20.5, 0));

        for (Manga manga:mangas){
            System.out.println(manga);
        }
    }
}
