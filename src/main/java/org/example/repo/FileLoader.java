package org.example.repo;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void carregar() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remover() {
        System.out.println("Deletando dados de um arquivo");
    }
}
