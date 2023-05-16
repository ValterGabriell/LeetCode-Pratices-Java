package org.example.collections.Listas;

import org.example.collections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class SortMangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga1.getId());
    }
}


public class MangaSorteTest01{
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Naruto", 15.4));
        mangas.add(new Manga(5L, "Attack on titan", 19.9));
        mangas.add(new Manga(6L, "Dragon Ball", 9.9));
        mangas.add(new Manga(2L, "7 pecados", 20.5));
        for (Manga manga:mangas){
            System.out.println(manga);
        }

        System.out.println("--------");
        Collections.sort(mangas);
        for (Manga manga:mangas){
            System.out.println(manga);
        }

        System.out.println("--------");
        mangas.sort(new SortMangaByIdComparator());
        for (Manga manga:mangas){
            System.out.println(manga);
        }

    }
}
