package org.example.biblioteca.sort;

import org.example.biblioteca.Livro;

import java.util.Comparator;

public class TituloSort implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
