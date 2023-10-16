package org.example.lambdas.function;

import java.util.function.Consumer;

public class MainApp {
    public static void main(String[] args) {
        Printable printable = (text) -> {
            System.out.println("Imprimindo"+
                    text);
        };
        printable.print(" isso!!!!!");

        printThis((text)->{
            System.out.println("" +
                    "imprimindo 2"+
                    text);
        });

    }

    static void printThis(Printable printable){
        printable.print("ISSSSOO!!!!!!!");
    }
}



