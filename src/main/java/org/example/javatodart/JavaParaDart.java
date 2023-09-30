package org.example.javatodart;

import java.time.LocalDate;

public class JavaParaDart {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}

class CarroVoador implements AcaoAviao, AcaoCarro {

    String marcaCarroVoador;

    public CarroVoador(String marcaCarroVoador) {
        this.marcaCarroVoador = marcaCarroVoador;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void decolar() {

    }

    @Override
    public void aterrissar() {

    }
}

class Uno extends CarroVoador {
    public Uno(String marcaCarroVoador) {
        super(marcaCarroVoador);
    }
}


interface AcaoCarro {
    void ligar();
    void desligar();
}

interface AcaoAviao {
    void decolar();
    void aterrissar();
}

class Aviao{
    String marca;

    public Aviao(String marca) {
        this.marca = marca;
    }
}

class Carro {
    String marca;
    int anoDeFabricacao;

    public Carro(String marca, int anoDeFabricacao) {
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public Carro(String marca) {
        this.marca = marca;
        this.anoDeFabricacao = LocalDate.now().getYear();
    }


}
