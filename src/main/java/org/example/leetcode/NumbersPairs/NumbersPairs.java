package org.example.leetcode.NumbersPairs;

public class NumbersPairs {
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 1};
        countKDifference(ints, 1);
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int baseValue = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int refValue = nums[j];
                int minus = baseValue - refValue;
                if (minus == k || minus == -k) {
                    count++;
                }
            }
        }
        return count;
    }
}
