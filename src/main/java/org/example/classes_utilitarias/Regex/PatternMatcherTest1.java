package org.example.classes_utilitarias.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest1 {
    public static void main(String[] args) {
        String regex = "\\w";
        String text2 = "ajs dçf jl\tçkj2l_3kjf2o3if9283fj-2q489gfw3n4g-=8394jhg";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text:   " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posicões encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
