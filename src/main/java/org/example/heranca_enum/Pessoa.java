package org.example.heranca_enum;

public class Pessoa {
    protected String cpf;
    protected String nome;
    protected TipoPessoa pessoa;

    public void imprime() {
        System.out.println(this.cpf);
        System.out.println(this.nome);
        System.out.println(this.pessoa.toString());
    }

    public TipoPessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(TipoPessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
