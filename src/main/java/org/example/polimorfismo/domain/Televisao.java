package org.example.polimorfismo.domain;

public class Televisao extends Produto{
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando importo televisao");
        return this.valor * 0.21;
    }
}
