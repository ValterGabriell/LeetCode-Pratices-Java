package org.example.classes_utilitarias.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/valter/gabriel";
        String arquitoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquitoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
    }
}
