package org.example.Anonimas;


import org.example.generics.teste.domain.Barco;

import java.util.Comparator;
import java.util.List;


public class AnonymousClass02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new java.util.ArrayList<>(List.of(new Barco("Xanoa"), new Barco("Titanic")));
        barcoList.sort(new Comparator<Barco>(){
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(barcoList);
    }
}
