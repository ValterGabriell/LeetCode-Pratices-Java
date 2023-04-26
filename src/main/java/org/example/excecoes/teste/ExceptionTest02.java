package org.example.excecoes.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("C:\\Users\\vgabr\\Documents\\GABRIEL\\Programacao\\BackendJava\\oop\\src\\arquivo.txt");
        try {
            boolean b = file.createNewFile();
            System.out.println("Arquivo criado " + b);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
