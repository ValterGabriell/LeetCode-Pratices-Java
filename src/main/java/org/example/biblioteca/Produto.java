package org.example.biblioteca;

public class Produto implements Comparable<Produto> {
    private int quantidade;
    private double preco;
    private String nome;


    public Produto(int quantidade, double preco, String nome) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Produto atual) {
       return this.nome.compareTo(atual.getNome());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "quantidade=" + quantidade +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
