package org.example.polimorfismo.servico;

import org.example.polimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando banco de dados");
    }
}
