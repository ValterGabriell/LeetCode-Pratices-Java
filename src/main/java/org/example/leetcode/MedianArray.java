package org.example.leetcode;

import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6};
        String result = arrayChallenge(arr);
        System.out.println(result); // Saída: 1,2,3,5,6,6,4,3
    }

    public static String arrayChallenge(int[] arr) {
        int windowSize = arr[0];
        int[] numbers = Arrays.copyOfRange(arr, 1, arr.length);
        int[] window = new int[windowSize];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            // Preenche a janela deslizante com os elementos anteriores
            for (int j = 0; j < windowSize; j++) {
                if (i - j >= 0) {
                    window[j] = numbers[i - j];
                }
            }

            // Ordena a janela deslizante em ordem crescente
            Arrays.sort(window);

            // Calcula a mediana
            int median;
            if (windowSize % 2 == 0) {
                median = (window[windowSize / 2 - 1] + window[windowSize / 2]) / 2;
            } else {
                median = window[windowSize / 2];
            }

            // Adiciona a mediana ao resultado
            result.append(median);

            // Adiciona vírgula se não for o último elemento
            if (i < numbers.length - 1) {
                result.append(",");
            }
        }

        return result.toString();
    }
}
