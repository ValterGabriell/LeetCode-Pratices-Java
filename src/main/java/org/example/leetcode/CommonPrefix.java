package org.example.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"ana", "anao", "anapolis", "pedro do flamengo", "ananaias"};
        System.out.println(prefix("anapolis"));
    }

    private static String prefix(String str) {
        int len = str.length();
        if (len == 1) {
            return "-1";
        }

        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0) {
                String substring = str.substring(0, i);
                StringBuilder repeatedSubstring = new StringBuilder();
                repeatedSubstring.append(substring.repeat(len / i));
                if (repeatedSubstring.toString().equals(str)) {
                    return substring;
                }
            }
        }

        return "-1";
    }
}
