package org.example.generics;

public class Televisao extends Produto{
    private String marca;
    public Televisao(String marca, String titulo, Number valor) {
        super(titulo, valor);
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
}
