package org.example.youtube.equals;

public class MainApp {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Pulp Fiction", 1995);
        Filme filme2 = new Filme("Pulp Fiction", 2000);

        System.out.println(filme1.hashCode());
        System.out.println(filme2.hashCode());

        System.out.println();

        System.out.println(filme1);
        System.out.println(filme2);

        System.out.println(filme1.equals(filme2));

    }
}
