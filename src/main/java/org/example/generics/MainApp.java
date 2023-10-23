package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao("LG", "Televisão", 123);
        List<Televisao> televisaos = new ArrayList<>();
        televisaos.add(tv1);


        Produto produto = new Produto("Produto", 123);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);


        doSomething(televisaos);
        doSmtg(produtos);
    }

    static void doSomething(List<? extends Produto> list) {
       list.forEach(System.out::println);
    }

    static void doSmtg(List<? super Televisao> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
