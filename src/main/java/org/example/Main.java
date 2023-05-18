package org.example;

import org.example.heranca_enum.Funcionario;
import org.example.heranca_enum.TipoPagamento;
import org.example.heranca_enum.TipoPessoa;
import org.example.teste.Herdada;
import org.example.teste.Herdeira;

public class Main {

    public static void processa(Object arr){
        if (arr instanceof long[]){
            long[] nums = (long[]) arr;
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }
        if (arr instanceof StringBuffer[]){
            System.out.println("array de array");
        }
    }

    public static void main(String[] args) {
        Herdeira herdeira = new Herdeira();
        herdeira.teste();
    }
}