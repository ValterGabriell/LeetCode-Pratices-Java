package org.example.generics.teste;

import org.example.generics.service.CarroSustentavelService;
import org.example.generics.teste.domain.Carro;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroSustentavelService cs = new CarroSustentavelService();
        Carro carro = cs.retrieveAvaiableCars();
        System.out.println("Usando o carro por 1 mes...");
        cs.giveBackRentalCar(carro);
    }
}
