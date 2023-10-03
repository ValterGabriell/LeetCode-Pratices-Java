package org.example.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Produto produto1 = new Produto(10, 29.99, "Camiseta");
        Produto produto2 = new Produto(5, 49.99, "Tênis");
        Produto produto3 = new Produto(2, 9.99, "Caneta");
        Produto produto4 = new Produto(3, 199.99, "Smartphone");
        Produto produto5 = new Produto(8, 59.99, "Livro");
        Produto produto6 = new Produto(8, 59.99, "AABBAA");
        Produto produto7 = new Produto(8, 59.99, "DEEEBA");
        Produto produto8 = new Produto(8, 59.99, "ZEEEEBAA");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        Collections.sort(produtos);

        int posicao = Collections.binarySearch(produtos, produto8);
        // -4-1 = -5
        System.out.println("POSICAO DO PRODUTO: " + posicao);
        if (posicao < 0){
            // -(-1) = 1
            posicao = -posicao - 1;
            produtos.add(posicao, produto8);
        }
        System.out.println(produtos);






    }
}
