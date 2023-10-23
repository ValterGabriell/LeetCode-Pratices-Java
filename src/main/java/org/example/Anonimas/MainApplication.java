package org.example.Anonimas;

public class MainApplication {
    public static void main(String[] args) {
        GrooveStreet p1 = new GrooveStreet("Carl Jhonson");
        p1.andar();
        p1.roubarCarro();

        GrooveStreet.Fugir fugir = p1.new Fugir() {
        };
        fugir.fugirDaPolicia();

        GrooveStreet p2 = new GrooveStreet("Big Smoke") {
            //classe anonima
            @Override
            public void andar() {
                System.out.println("Andando desfilando");
            }

            @Override
            public void roubar() {
                System.out.println("Roubando desfilando");
            }
        };
        p2.andar();
        p2.roubarCarro();


        PersonagemActions personagemActions = new PersonagemActions() {

            @Override
            public void andar() {
                System.out.println("Personagem aleatório andando");
            }

            @Override
            public void roubar() {
                System.out.println("Personagem aleatório roubando");
            }
        };
        personagemActions.andar();
        personagemActions.roubar();
    }
}
