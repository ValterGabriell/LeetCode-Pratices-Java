package org.example;

import org.example.heranca.Funcionario;
import org.example.heranca.TipoPagamento;
import org.example.heranca.TipoPessoa;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(200);
        funcionario.setNome("Gabriel");
        funcionario.setCpf("0000");
        funcionario.setPessoa(TipoPessoa.PESSOA_FISICA);
        funcionario.setTipoPagamento(TipoPagamento.CREDITO);
        funcionario.imprime();
        funcionario.relatorioPagamento(150);
    }
}