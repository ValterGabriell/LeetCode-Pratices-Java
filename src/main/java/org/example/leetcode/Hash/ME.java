package org.example.leetcode.Hash;

import java.util.HashMap;

public class ME {
    public static void main(String[] args) {
        int[] array = {
                3,2,3
        };
        int element = MajorityElement(array);
        System.out.println(element);
    }

    private static int MajorityElement(int[] nums) {
        HashMap<Integer, Integer> valores
                = new HashMap<>();

        for (int num : nums) {
            verificaValorNoHash(valores, num);
            int quantidadeValorAtual =
                    valores.get(num);
            if (quantidadeValorAtual >
                    (nums.length/2)){
                return num;
            }
        }
        return -1;
    }

    private static void verificaValorNoHash(
            HashMap<Integer, Integer> valores,
            int num) {
        boolean containsKey = valores
                .containsKey(num);
        if (containsKey) {
            int quantidade =
                    valores.get(num);
            quantidade += quantidade;
            valores.put(num, quantidade);
        } else {
            valores.put(num, 1);
        }
    }
}
