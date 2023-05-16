package org.example.lambdas;

import org.example.lambdas.dominio.Anime;
import org.example.lambdas.dominio.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("beserk", 43)
                , new Anime("naruto", 720)
                , new Anime("death note", 54)));
//        Collections.sort(anime, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(anime, AnimeComparators::compareByEpisodes);
        System.out.println(anime);
    }
}
