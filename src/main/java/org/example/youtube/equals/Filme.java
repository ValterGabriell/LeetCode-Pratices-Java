package org.example.youtube.equals;

public class Filme {
    private String nome;
    private int ano;

    public Filme(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public boolean equals(Object obj) {
        Filme f = (Filme) obj;
        return this.nome.equals(f.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
