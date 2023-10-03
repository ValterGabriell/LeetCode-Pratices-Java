package org.example.biblioteca;

import java.util.Comparator;

public class QuantidadeOrdenacao implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        if (o1.getQuantidade() < o2.getQuantidade()) {
            return -1;
        } else if (o1.getQuantidade() > o2.getQuantidade()) {
            return 1;
        } else {
            return 0;
        }
    }
}
