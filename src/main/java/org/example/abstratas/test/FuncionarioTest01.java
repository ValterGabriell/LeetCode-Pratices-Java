package org.example.abstratas.test;

import org.example.abstratas.Desenvolvedor;
import org.example.abstratas.Funcionario;
import org.example.abstratas.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Touya", 3000);
        System.out.println(gerente);
        System.out.println(dev);
    }


}
