package org.example.excecoes.teste.runtime;

public class RunTimeTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     *
     * @param a
     * @param b - nao pode ser zero
     * @return
     * @throws IllegalArgumentException caso B seja 0
     */
    private static int divisao(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal");
        }
        return a/b;
    }
}
