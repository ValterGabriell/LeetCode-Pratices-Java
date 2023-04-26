package org.example.excecoes.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("C:\\Users\\vgabr\\Documents\\GABRIEL\\Programacao\\BackendJava\\oop\\src\\arquivo.txt");
        try {
            boolean b = file.createNewFile();
            System.out.println("Arquivo criado " + b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
