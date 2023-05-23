package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        String su = s.toUpperCase().trim();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String four = "IV";
        String nine = "IX";
        String fourty = "XL";
        String ninety = "XC";
        String fourhundred = "CD";
        String ninehundred = "CM";

        su = su.replace(four, "IIII");
        su = su.replace(nine, "VIIII");
        su = su.replace(fourty, "XXXX");
        su = su.replace(ninety, "LXXXX");
        su = su.replace(fourhundred, "CCCC");
        su = su.replace(ninehundred, "DCCCC");

        int result = 0;
        for (int i = 0; i < su.length(); i++) {
            char c = su.charAt(i);
            result = result + map.get(c);
        }
        return result;
    }

}
