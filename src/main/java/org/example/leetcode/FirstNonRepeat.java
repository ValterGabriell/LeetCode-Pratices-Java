package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static void main(String[] args) {
        System.out.println(SearchingChallenge("abcdef"));
    }

    public static String SearchingChallenge(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int aux = 1;
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer integer = map.get(c);
                integer += 1;
                map.put(c, integer);
            } else {
                map.put(c, aux);
            }
        }

        int primeiroIndice = str.length();
        for (Map.Entry<Character, Integer> forMap : map.entrySet()) {
            if (forMap.getValue() == 1) {
                Character character = forMap.getKey();
                int i = str.indexOf(character);
                if (i < primeiroIndice) {
                    primeiroIndice = i;
                }
            }
        }

        String resultValue = String.valueOf(str.charAt(primeiroIndice));
        return resultValue + ":" + "f6ynkeqc78";
    }
}
