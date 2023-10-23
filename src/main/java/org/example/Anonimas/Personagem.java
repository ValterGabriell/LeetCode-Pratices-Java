package org.example.Anonimas;

import java.time.LocalDateTime;

public class Personagem implements PersonagemActions{
    private String name;


    public Personagem(String name) {
        this.name = name;
    }

    @Override
    public void andar() {
        System.out.println(name + " está andando!");
    }

    @Override
    public void roubar() {
        System.out.println(name + " está roubando!");
    }
}
