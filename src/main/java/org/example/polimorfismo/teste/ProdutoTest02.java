package org.example.polimorfismo.teste;

import org.example.polimorfismo.domain.Computador;
import org.example.polimorfismo.domain.Produto;
import org.example.polimorfismo.domain.Tomate;
import org.example.polimorfismo.servico.CalculaImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("MAC", 3000);
        Tomate tomate = new Tomate("Tomate", 20);
        tomate.setDataValidade("11/12/2021");

        CalculaImposto.calculaImposto(tomate);
        System.out.println("--------------------");
        CalculaImposto.calculaImposto(produto);
    }
}
