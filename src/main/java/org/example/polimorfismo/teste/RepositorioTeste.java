package org.example.polimorfismo.teste;

import org.example.polimorfismo.repository.Repositorio;
import org.example.polimorfismo.servico.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorioBancoDeDados = new RepositorioArquivo();
        repositorioBancoDeDados.salvar();
    }
}
