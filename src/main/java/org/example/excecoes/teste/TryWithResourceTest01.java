package org.example.excecoes.teste;

import org.example.excecoes.dominio.Leitor1;
import org.example.excecoes.dominio.Leitor2;

import java.io.*;

public class TryWithResourceTest01 {
    public static void main(String[] args) {
        lerArquivo2();
    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void lerArquivo2() {
        try (Leitor1 l1 = new Leitor1(); Leitor2 l2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }
}
