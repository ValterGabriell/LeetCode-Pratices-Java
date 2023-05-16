package org.example.collections.Listas;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        names.add("Valter");
        names.add("Gabriel");

        for (String nome : names){
            System.out.println(nome.replace("V", "Y"));
        }
        System.out.println("-------------");



    }
}
