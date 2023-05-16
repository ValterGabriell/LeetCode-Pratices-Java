package org.example.lambdas;

import org.example.lambdas.dominio.Anime;
import org.example.lambdas.dominio.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("beserk", 43)
                , new Anime("naruto", 720)
                , new Anime("death note", 54)));
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
    }
}

