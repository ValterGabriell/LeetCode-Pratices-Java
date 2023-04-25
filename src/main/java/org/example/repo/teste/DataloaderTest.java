package org.example.repo.teste;

import org.example.repo.DatabaseLoader;
import org.example.repo.FileLoader;

public class DataloaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.carregar();
        fileLoader.carregar();
        databaseLoader.remover();
        fileLoader.remover();
        databaseLoader.checkPermission();
    }
}
