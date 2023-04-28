package org.example.excecoes.teste;

import org.example.excecoes.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalido01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.println("usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("senha");
        String passwordDigitada = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitada)) {
            throw new LoginInvalidoException("Usuário sou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
