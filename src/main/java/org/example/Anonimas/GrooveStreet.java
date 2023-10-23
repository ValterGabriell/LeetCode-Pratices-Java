package org.example.Anonimas;

public class GrooveStreet extends Personagem{
    private String name;
    public GrooveStreet(String name) {
        super(name);
        this.name = name;
    }

    void roubarCarro(){
        System.out.println(name + " está roubando carro!");
    }

    public class Fugir {
        void fugirDaPolicia(){
            System.out.println(name + " está se escondendo da policia!");
        }
    }

}
