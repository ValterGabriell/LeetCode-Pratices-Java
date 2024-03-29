package org.example.heranca_enum;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.01;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };


    public abstract double calcularDesconto(double valor);
}
