package org.example.leetcode.SplitString;

public class SplitString {
    public static void main(String[] args) {
        String test01 = "RLRRRLLRLL";
        int i = balancedStringSplit(test01);
        System.out.println(i);
    }

    public static int balancedStringSplit(String s) {
        int sum = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                sum += 1;
            } else {
                sum -= 1;
            }

            if (sum == 0) {
                result++;
            }
        }
        return result;
    }
}
