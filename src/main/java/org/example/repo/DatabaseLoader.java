package org.example.repo;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void carregar() {
        System.out.println("carregando dados do banco de dados!");
    }

    @Override
    public void remover() {
        System.out.println("deletando dados do banco de dados!");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissoes no banco de dados!");
    }
}
