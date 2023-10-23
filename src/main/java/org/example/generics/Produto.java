package org.example.generics;

public class Produto {
    private String titulo;
    private Number valor;

    public Produto(String titulo, Number valor) {
        this.titulo = titulo;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Number getValor() {
        return valor;
    }
}

/*
Já o método doSmtg aceita uma lista de Televisao ou superclasses de Televisao.
Essa abordagem nos dá a flexibilidade de adicionar objetos do tipo Televisao e seus supertipos à lista.
 */