package org.example.optionals;

import org.example.optionals.dominio.Manga;
import org.example.optionals.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> naruto = MangaRepository.findByTitle("Naruto");
        naruto.ifPresent(m -> m.setTitle(m.getTitle() + " 2"));
        System.out.println(naruto);

        try {
            Manga manga = MangaRepository.findById(2).orElseThrow(IllegalAccessException::new);
            System.out.println(manga);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Manga manga = MangaRepository.findByTitle("Dragon Ball").orElseGet(() -> new Manga(3, "dragon ball", 55));
        System.out.println(manga);
    }
}
