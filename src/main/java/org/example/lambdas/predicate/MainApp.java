package org.example.lambdas.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainApp {
    public static void main(String[] args) {
        /*
          Para entender eles preparei um snippet que irá vasculhar dados numa lista de inteiros
          que representa idade das pessoas.
          Verificaremos quem é:

          Adulto; Não Adulto; Adulto ou Idoso; Adolescente
         */
        List<Integer> idades = List
                .of(12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 90, 31, 87, 47, 72, 67, 61, 55);

        List<Integer> adulto = new ArrayList<>();
        List<Integer> naoAdulto = new ArrayList<>();
        List<Integer> adultoOuIdoso = new ArrayList<>();
        List<Integer> adolescente = new ArrayList<>();




        /*
        Filtrando apenas quem é adulto, o método test()
        irá retornar um booleano, no qual irá realizar
        a verificação de acordo com o predicate:
         */
        Predicate<Integer> ehAdulto = val -> val >= 18 && val <= 65;
        for (Integer idade : idades) {
            if (ehAdulto.test(idade))
                adulto.add(idade);
        }

         /*
        Filtrando apenas quem é NÃO é adulto, o método negate()
        irá retornar um os predicate que NÃO satisfazem a condição
         */
        for (Integer idade:idades){
            if (ehAdulto.negate().test(idade))
                naoAdulto.add(idade);
        }

         /*
        Filtrando quem é adulto OU idoso utilizando o OR()
         */
        Predicate<Integer> ehIdoso = val -> val > 65;
        for (Integer idade:idades){
            if (ehAdulto.or(ehIdoso).test(idade))
                adultoOuIdoso.add(idade);
        }

           /*
        Filtrando apenas adolescente utilizando o AND() e o NEGATE()
         */
        Predicate<Integer> ehAdolescente = val -> val <= 17;
        Predicate<Integer> ehCrianca = val -> val < 14;
        for (Integer idade:idades){
            if (ehAdolescente.and(ehCrianca.negate()).test(idade))
                adolescente.add(idade);
        }

        System.out.println("Adolescente");
        System.out.println(adolescente);

        System.out.println("adulto ou idoso");
        System.out.println(adultoOuIdoso);

        System.out.println("Não adultos (Criança e Idosos)");
        System.out.println(naoAdulto);

        System.out.println("Adultos");
        System.out.println(adulto);


    }
}
