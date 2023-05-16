package org.example.generics.service;

import org.example.generics.teste.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroSustentavelService {
    private List<Carro> carroDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
    public Carro retrieveAvaiableCars(){
        System.out.println("Buscando carro disponivel");
        Carro carro = carroDisponiveis.remove(0);
        System.out.println("Alugando carro..." + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carroDisponiveis);
        return carro;
    }

    public void giveBackRentalCar(Carro carro){
        System.out.println("Devolvendo carro + " + carro);
        carroDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carroDisponiveis);
    }

}
