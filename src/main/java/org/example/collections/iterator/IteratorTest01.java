package org.example.collections.iterator;

import org.example.collections.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Naruto", 15.4, 0));
        mangas.add(new Manga(5L, "Attack on titan", 19.9, 5));
        mangas.add(new Manga(6L, "Dragon Ball", 9.9, 3));
        mangas.add(new Manga(2L, "7 pecados", 20.5, 0));

        Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()) {
            Manga manga = iterator.next();
            if (manga.getQuantidade() == 0) {
                iterator.remove();
            }
        }
        System.out.println(mangas);


        mangas.removeIf(manga -> manga.getQuantidade() == 0);

    }
}
