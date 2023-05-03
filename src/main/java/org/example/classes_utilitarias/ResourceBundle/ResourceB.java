package org.example.classes_utilitarias.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceB {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
    }
}
