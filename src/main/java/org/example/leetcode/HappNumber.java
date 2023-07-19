package org.example.leetcode;

import java.util.stream.IntStream;

public class HappNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {
        String valueOf = String.valueOf(n);
        char[] charArray = valueOf.toCharArray();
        int finalValue = 0;
        boolean isValid = false;
        int increment = 0;


        while (finalValue != 1){
            for (char c : charArray) {
                String s = String.valueOf(c);
                Integer is = Integer.parseInt(s);
                finalValue = (int) (finalValue + Math.pow(is, 2));
            }

            if (finalValue % 2 == 0 && finalValue > 1 && finalValue < 9 || finalValue % 3 == 0 && finalValue > 1 && finalValue < 10 || finalValue % 5 == 0 && finalValue > 1 && finalValue < 9){
                return false;
            }
            if (finalValue == 1){
                isValid = true;
            }else{
                charArray = String.valueOf(finalValue).toCharArray();
                finalValue = 0;
                increment = increment + 1;
                if (increment == Integer.MAX_VALUE){
                    return false;
                }
            }
        }
        return isValid;
    }
}
