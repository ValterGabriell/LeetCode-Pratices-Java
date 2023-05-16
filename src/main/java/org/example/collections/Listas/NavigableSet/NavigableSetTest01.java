package org.example.collections.Listas.NavigableSet;

import org.example.collections.dominio.Manga;
import org.example.collections.dominio.SmarthPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartPhoneMarcaComparator implements Comparator<SmarthPhone> {
    @Override
    public int compare(SmarthPhone o1, SmarthPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmarthPhone> set = new TreeSet<>(new SmartPhoneMarcaComparator());
        SmarthPhone ihpone = new SmarthPhone("123", "ihpone");
        set.add(ihpone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L, "Naruto", 15.4, 0));
        mangas.add(new Manga(5L, "Attack on titan", 19.9, 5));
        mangas.add(new Manga(6L, "Dragon Ball", 9.9, 3));
        mangas.add(new Manga(2L, "7 pecados", 20.5, 0));
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
        Manga beserk = new Manga(21L, "Beserk", 12, 5);
        System.out.println("-------------------");
        System.out.println(mangas.lower(beserk));
        System.out.println(mangas.floor(beserk));
        System.out.println(mangas.higher(beserk));
        System.out.println(mangas.ceiling(beserk));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());


    }
}
