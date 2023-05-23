package org.example.leetcode;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x);
        char[] charArray = numberAsString.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            stack.add(c);
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return numberAsString.contentEquals(builder);
    }
}
