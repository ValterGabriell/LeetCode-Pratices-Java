package org.example.collections.MapTest01;

import org.example.collections.dominio.Consumidor;
import org.example.collections.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Valter");
        Consumidor c2 = new Consumidor("Gabriel");

        Manga naruto = new Manga(1L, "Naruto", 15.4, 0);
        Manga attackOnTitan = new Manga(5L, "Attack on titan", 19.9, 5);
        Manga dragonBall = new Manga(6L, "Dragon Ball", 9.9, 3);
        Manga manga = new Manga(2L, "7 pecados", 20.5, 0);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, naruto);
        consumidorMangaMap.put(c2, dragonBall);

        for (Map.Entry<Consumidor, Manga> entry:consumidorMangaMap.entrySet()){
            System.out.println(entry);
        }
    }
}
