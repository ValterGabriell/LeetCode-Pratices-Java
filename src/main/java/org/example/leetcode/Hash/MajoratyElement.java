package org.example.leetcode.Hash;

import java.util.HashMap;

public class MajoratyElement {
    public static void main(String[] args) {
        int[] array = {
                3,2,3
        };
        int element = MajorityElement(array);
        System.out.println(element);
    }

    private static int MajorityElement(int[] nums) {
        HashMap<Integer, Integer> valores = new HashMap<>();
        for (int num : nums) {
            oValorEstaNaListaEIncrementaAQuantidade(valores, num);
            Integer quantidadeDoValorAtual = valores.get(num);
            if (quantidadeDoValorAtual > (nums.length / 2)) {
                return num;
            }
        }
        return -1;
    }

    private static void oValorEstaNaListaEIncrementaAQuantidade(HashMap<Integer, Integer> hashMap, int key) {
        boolean containsKey = hashMap.containsKey(key);
        if (containsKey) {
            Integer quantidade = hashMap.get(key);
            quantidade = quantidade + 1;
            hashMap.put(key, quantidade);
        } else {
            hashMap.put(key, 1);
        }
    }
}
