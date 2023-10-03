package org.example.youtube.map.HashSet;

public class Book implements Comparable<Book> {
    private String ISBN;
    private String nome;

    public Book(String ISBN, String nome) {
        this.ISBN = ISBN;
        this.nome = nome;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.ISBN.compareTo(o.getISBN());
    }
}
