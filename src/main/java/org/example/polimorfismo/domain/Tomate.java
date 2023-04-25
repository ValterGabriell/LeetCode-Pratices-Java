package org.example.polimorfismo.domain;

public class Tomate extends Produto{
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto tomate");
        return this.valor * 0.06;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
