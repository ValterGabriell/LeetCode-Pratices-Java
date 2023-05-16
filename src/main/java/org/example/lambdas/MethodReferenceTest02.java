package org.example.lambdas;

import org.example.lambdas.dominio.Anime;
import org.example.lambdas.dominio.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.List;


public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("beserk", 43)
                , new Anime("naruto", 720)
                , new Anime("death note", 54)));
        AnimeComparators animeComparators = new AnimeComparators();
        anime.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(anime);

    }
}
