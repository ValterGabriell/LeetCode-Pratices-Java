package org.example.youtube.factory;

import org.example.youtube.factory.factory.AnimalFactory;
import org.example.youtube.factory.factory.TYPE_ANIMAL;

public class Main {
    public static void main(String[] args) {
        var dog = AnimalFactory.getInstance("Mel", 2, true);
        dog.checkIn();
        var cat = AnimalFactory.getInstance("Luna", 1, false);
        cat.checkIn();
        var catEspecial = AnimalFactory.getInstance("Egipcio", 3, TYPE_ANIMAL.CAT_ESPECIAL);
        catEspecial.checkIn();
    }
}
