package org.example.biblioteca;

import org.example.biblioteca.sort.AnoSort;
import org.example.biblioteca.sort.TituloSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarNovoLivro(Livro livro) {
        //ordenando por ISBN
        Collections.sort(livros);
        //se for negativo, livro nao encontrado. Posicao = -posicao-1
        int posicao = Collections.binarySearch(livros, livro);
        //valor nao encontrado
        if (posicao < 0) {
            posicao = -posicao - 1;
            livros.add(posicao, livro);
        }
    }

    public void buscarTodosOsLivros() {
        System.out.println("TODOS OS LIVROS ------");
        System.out.println(livros.toString());
        System.out.println(livros.size());
    }

    public void ordenarLivrosPorTitulo(){
        TituloSort tituloSort = new TituloSort();
        livros.sort(tituloSort);
        System.out.println("LIVROS ORDENADOS POR TITULO----");
        System.out.println(livros);
    }

    public void ordenarLivrosPorAno(){
        AnoSort anoSort = new AnoSort();
        livros.sort(anoSort);
        System.out.println("LIVROS ORDENADOS POR ANO---------");
        System.out.println(livros);
    }


}