package org.example.polimorfismo.domain;

public class Computador extends Produto {
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando importo computador");
        return this.valor * 0.21;
    }




}
