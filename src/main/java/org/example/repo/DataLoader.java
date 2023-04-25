package org.example.repo;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;

    void carregar();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes");
    }


}
