package org.example.teste;

import java.util.LinkedList;

public class EncontraMultiplo {


    private static void calcularMMC(int a, int b) {
        int menor = Math.min(a, b);
        int mmc = 1;

        for (int i = 2; i <= menor; i++) {
            while (a % i == 0 && b % i == 0) {
                mmc = mmc * i;
                a = a / i;
                b = b / i;
            }
        }
        System.out.println("O MMC de " + a + " e " + b + " é: " + mmc * a * b);
    }

    public static void main(String[] args) {
        calcularMMC(345, 25);
    }
}