package org.example.youtube.decorator;

public class Main {
    public static void main(String[] args) {
        Formatador formatador =
                new UpperCase(new FormatadorImpl());

        String formatar = formatador.formatar();
        System.out.println(formatar);
    }
}
