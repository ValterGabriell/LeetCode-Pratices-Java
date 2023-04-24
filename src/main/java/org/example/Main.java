package org.example;

import org.example.heranca_enum.Funcionario;
import org.example.heranca_enum.TipoPagamento;
import org.example.heranca_enum.TipoPessoa;

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
        funcionario.getIdentificador();
    }
}