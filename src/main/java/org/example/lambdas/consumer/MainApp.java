package org.example.lambdas.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainApp {
    public static void main(String[] args) {
        Consumer<Integer> display = System.out::println;
        display.accept(10);


        List<String> words = new ArrayList<>();
        words.add("Valter");
        words.add("Gabriel");
        words.add("Brito");

        words.stream().forEach(item -> {
            var index = -1;
            String newString = item.concat(" - Java");
            index++;
            words.set(index, newString);
            System.out.println(newString);
        });


        Consumer<String> word = val -> val.concat(" JAVA");
        Consumer<String> showWord = val -> System.out.println(val);

        word .accept("Eita como é bom programar em ");




    }
}
