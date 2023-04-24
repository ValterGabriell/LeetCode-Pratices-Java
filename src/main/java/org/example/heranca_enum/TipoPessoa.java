package org.example.heranca_enum;

public enum TipoPessoa {
    PESSOA_FISICA(1, "CPF"),
    PESSOA_JURIDICA(2, "CNPJ");


    private int valor;
    private String identificador;

    TipoPessoa(int valor, String identificador) {
        this.valor = valor;
        this.identificador = identificador;
    }

    public int getVALOR() {
        return valor;
    }

    public String getIdentificador() {
        return identificador;
    }
}
