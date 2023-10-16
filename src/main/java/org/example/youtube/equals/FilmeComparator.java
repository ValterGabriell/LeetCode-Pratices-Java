package org.example.youtube.equals;

import java.util.Comparator;

public class FilmeComparator implements Comparator<Filme> {

    @Override
    public int compare(Filme o1, Filme o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
