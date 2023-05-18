package org.example.teste;

import java.util.*;

public class EncontraDivisor {

    public static List<Integer> primosAteCem = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
            59, 61, 67, 71, 73, 79, 83, 89, 97);

    public static void main(String[] args) {

        //Para DEBUGAR utilize o System.err.println()
        System.err.println("My debug messages");

        System.out.println(resolver(10,20,30));
    }

    private static int pegaOMaiorValor(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static int resolver(int... nums) {
        int solucao = pegaOMaiorValor(nums);

        while (solucao > 1) {
            boolean todosDivisiveis = true;

            for (int numero : nums) {
                if (numero % solucao != 0) {
                    todosDivisiveis = false;
                    break;
                }
            }

            if (todosDivisiveis) {
                break;
            }

            solucao--;
        }

        return solucao;
    }
}