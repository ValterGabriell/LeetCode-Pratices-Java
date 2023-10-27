package org.example.leetcode.LinkedList;

import java.util.Stack;

public class Palindromo {
    public boolean isPalindrome(ListNode head) {
        ListNode listNode = head;

        Stack<Integer> stack = new Stack<>();
        StringBuilder initialValue = new StringBuilder();
        while (listNode != null) {
            stack.push(listNode.val);
            initialValue.append(listNode.val);
            listNode = listNode.next;
        }

        StringBuilder finalValue = new StringBuilder();
        while (!stack.isEmpty()) {
            Integer popped = stack.pop();
            finalValue.append(popped);
        }

        return initialValue.toString().contentEquals(finalValue);
    }
}
