package org.example.excecoes.teste.runtime;

public class RunTimeTest03 {
    public static void main(String[] args) {
        String s = abreConexao2();
        System.out.println(s);
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
//            throw new.txt RuntimeException();
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso pelo SO");
        }
        return null;
    }

    private static String abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
//            return "conexao aberta";
        } finally {
            System.out.println("Fechando recurso pelo SO");
        }
    }
}
