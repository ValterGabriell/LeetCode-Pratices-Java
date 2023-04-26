package org.example.polimorfismo.teste;

import org.example.polimorfismo.domain.Computador;
import org.example.polimorfismo.domain.Televisao;
import org.example.polimorfismo.domain.Tomate;
import org.example.polimorfismo.servico.CalculaImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Arroz Branco", 6);
        tomate.setDataValidade("25/12/2023");
        Computador vg = new Computador("PS5", 6000);
        CalculaImposto.calculaImposto(tomate);
        CalculaImposto.calculaImposto(vg);
    }
}
