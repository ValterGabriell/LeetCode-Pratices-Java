package org.example.classes_utilitarias.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path diretorio = Paths.get("home/valter");
        //nao existe gabriel no root do projeto, precisa resolver
        Path arquivo = Paths.get("gabriel/arquivo.txt");
        Path resolve = diretorio.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/gabriel");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        //quando usa absoluto, nao tem q resolver nada, nao pode adicionar de relativo pra absoluto
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));

    }
}
