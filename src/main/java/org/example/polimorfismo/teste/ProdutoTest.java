package org.example.polimorfismo.teste;

import org.example.polimorfismo.domain.Computador;
import org.example.polimorfismo.domain.Televisao;
import org.example.polimorfismo.domain.Tomate;
import org.example.polimorfismo.servico.CalculaImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC09", 11000);
        Tomate tomate = new Tomate("tomate", 10);
        Televisao tv = new Televisao("Samgung 50\"", 5000);
        CalculaImposto.calculaImposto(computador);
        CalculaImposto.calculaImposto(tomate);
        CalculaImposto.calculaImposto(tv);
    }
}
