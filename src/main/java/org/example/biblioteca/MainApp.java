package org.example.biblioteca;

public class MainApp {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro l1 = new Livro("Aventuras de Sherlock Holmes", "978-3-16-148410-0", "Arthur Conan Doyle", 1892);
        Livro l2 = new Livro("1984", "978-0-452-28423-4", "George Orwell", 1949);
        Livro l3 = new Livro("O Senhor dos Anéis", "978-0-618-25713-7", "J.R.R. Tolkien", 1954);
        Livro l4 = new Livro("Cem Anos de Solidão", "978-8-50-100966-5", "Gabriel García Márquez", 1967);
        Livro l5 = new Livro("Harry Potter e a Pedra Filosofal", "978-8-51-701056-5", "J.K. Rowling", 1997);
        Livro l6 = new Livro("O Pequeno Príncipe", "978-9-65-126515-2", "Antoine de Saint-Exupéry", 1943);
        Livro l7 = new Livro("O Pequeno Príncipe", "978-9-65-126515-2", "Antoine de Saint-Exupéry", 1943);

        biblioteca.adicionarNovoLivro(l1);
        biblioteca.adicionarNovoLivro(l2);
        biblioteca.adicionarNovoLivro(l3);
        biblioteca.adicionarNovoLivro(l4);
        biblioteca.adicionarNovoLivro(l5);
        biblioteca.adicionarNovoLivro(l6);
        biblioteca.adicionarNovoLivro(l7);

        biblioteca.buscarTodosOsLivros();
        System.out.println();
        biblioteca.ordenarLivrosPorTitulo();
        System.out.println();
        biblioteca.ordenarLivrosPorAno();


    }
}
