package org.example.polimorfismo.servico;

import org.example.polimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando arquivo");
    }
}
