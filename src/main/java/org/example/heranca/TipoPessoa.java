package org.example.heranca;

public enum TipoPessoa {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(1);


    private int valor;
    TipoPessoa(int valor) {
        this.valor = valor;
    }

    public int getVALOR() {
        return valor;
    }

}
