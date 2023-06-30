package org.example.leetcode;

import java.util.Stack;

public class LastLenght {
    public static void main(String[] args) {
        lastLenght("   fly me   to   the moon  ");
    }

    public static int lastLenght(String s) {
        //apagar os espaços em branco
        String stringWithoutSpacesLeadingTrailling = s.trim();
        char[] stringWithoutSpacesLeadingTraillingCharArray = stringWithoutSpacesLeadingTrailling.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char c : stringWithoutSpacesLeadingTraillingCharArray) {
            stack.push(c);
        }

        char aux = '-';
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            aux = stack.pop();
            if (aux != ' ') {
                stringBuilder.append(aux);
            }else{
                break;
            }
        }
        return stringBuilder.length();
    }


}
