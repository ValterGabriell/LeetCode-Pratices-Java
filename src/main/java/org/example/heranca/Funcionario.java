package org.example.heranca;

public class Funcionario extends Pessoa {
    private double salario;
    private TipoPagamento tipoPagamento;

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void relatorioPagamento(double valor) {
        System.out.println("Eu " + this.nome + " recebi um salario de " + (this.tipoPagamento.calcularDesconto(valor) + this.salario));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
