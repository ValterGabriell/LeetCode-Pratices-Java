package org.example.polimorfismo.servico;

import org.example.polimorfismo.domain.Produto;
import org.example.polimorfismo.domain.Tomate;

public class CalculaImposto {
    public static void calculaImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto: " + imposto);
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Nome: " + produto.getNome());
        if (produto instanceof Tomate tomate){
            System.out.printf(tomate.getDataValidade());
        }

    }
}
