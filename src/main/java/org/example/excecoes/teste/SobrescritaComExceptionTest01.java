package org.example.excecoes.teste;

import org.example.excecoes.dominio.Funcionario;
import org.example.excecoes.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();


    }
}
