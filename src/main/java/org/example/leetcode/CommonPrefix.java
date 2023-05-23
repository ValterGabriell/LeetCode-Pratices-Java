package org.example.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"ana", "anao", "anapolis", "pedro do flamengo"};
        System.out.println(prefix(arr));
    }

    private static String prefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String shortest = Arrays.stream(strs).min(Comparator.comparing(String::length)).get();
        //find the longest common prefix
        for (String str : strs) {
            while (str.indexOf(shortest) != 0) {
                shortest = shortest.substring(0, shortest.length() - 1);
            }
        }
        return shortest;
    }
}
