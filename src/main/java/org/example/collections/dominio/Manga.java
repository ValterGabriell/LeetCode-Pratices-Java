package org.example.collections.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nomeManga;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nomeManga, double preco) {
        Objects.requireNonNull(id, "id nao pode ser nulo");
        Objects.requireNonNull(nomeManga, "nome manga nao pode ser nulo");
        this.id = id;
        this.nomeManga = nomeManga;
        this.preco = preco;
    }

    public Manga(Long id, String nomeManga, double preco, int quantidade) {
        this(id, nomeManga, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nomeManga, manga.nomeManga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeManga);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeManga='" + nomeManga + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeManga() {
        return nomeManga;
    }

    public void setNomeManga(String nomeManga) {
        this.nomeManga = nomeManga;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Manga o) {
        return this.nomeManga.compareTo(o.getNomeManga());
//        if (this.id < o.getId()) {
//            return -1;
//        } else if (this.id.equals(o)) {
//            return 0;
//        } else {
//            return 1;
//        }
    }
}
