package org.example.generics.service;

import org.example.generics.teste.domain.Carro;

import java.util.List;

public class RentalService {

    private List<Carro> objetosDisponveis;

    public RentalService(List<Carro> objetosDisponveis) {
        this.objetosDisponveis = objetosDisponveis;
    }

    public Carro retrieveAvaiableCars(){
        System.out.println("Buscando carro disponivel");
        Carro carro = objetosDisponveis.remove(0);
        System.out.println("Alugando carro..." + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(objetosDisponveis);
        return carro;
    }

    public void giveBackRentalCar(Carro carro){
        System.out.println("Devolvendo carro + " + carro);
        objetosDisponveis.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(objetosDisponveis);
    }

}
