package org.example.Anonimas;

public class MainApp {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.smtg();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.whatsapp();

        Produto produto = new Produto();
        produto.setValue();

        Produto casaEstelar = new Produto() {
            @Override
            void setValue() {
                System.out.println("CASA ESTELAAAAR");
            }
        };
        casaEstelar.setValue();

        RodarJogo rodarJogo = new RodarJogo() {
            @Override
            public void print() {
                System.out.println("Ta rodando o bicho!");
            }
        };
        rodarJogo.print();

    }
}
