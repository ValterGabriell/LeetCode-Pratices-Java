package org.example.generics;

import java.util.List;

abstract class Animal2 {
    public abstract void consulta();
}

class Cachorro2 extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando doguinho!");
    }
}

class Gato2 extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gatinho!");
    }
}


public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        for (Object o : animals) {
            if (o instanceof Cachorro c) {
                c.consulta();
            }
        }
    }
}
