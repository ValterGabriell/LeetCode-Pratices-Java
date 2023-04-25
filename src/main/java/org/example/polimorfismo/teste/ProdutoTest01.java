package org.example.polimorfismo.teste;

import org.example.polimorfismo.domain.Computador;
import org.example.polimorfismo.domain.Produto;
import org.example.polimorfismo.domain.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Computador("MAC", 3000);
        System.out.println(produto.getNome());

        Produto produto2 = new Tomate("Tomate", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getValor());
    }
}
