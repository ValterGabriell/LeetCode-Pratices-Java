package org.example.biblioteca;

import java.util.Objects;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;

    private String ISBN;
    private int ano;
    private Boolean disponivelParaEmprestimo;

    public Livro(String titulo, String ISBN, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivelParaEmprestimo = true;
        this.ISBN = ISBN;
        this.ano = ano;
    }

    public Livro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Boolean getDisponivelParaEmprestimo() {
        return disponivelParaEmprestimo;
    }

    public void setDisponivelParaEmprestimo(Boolean disponivelParaEmprestimo) {
        this.disponivelParaEmprestimo = disponivelParaEmprestimo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //downcast
        Livro livro = (Livro) o;

        return Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor) && Objects.equals(ISBN, livro.ISBN) && ano == livro.ano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, ISBN, ano);
    }

    @Override
    public int compareTo(Livro o) {
        return this.ISBN.compareTo(o.getISBN());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", ISBN='" + ISBN + '\'' +
                ", disponivelParaEmprestimo=" + disponivelParaEmprestimo +
                '}';
    }
}
