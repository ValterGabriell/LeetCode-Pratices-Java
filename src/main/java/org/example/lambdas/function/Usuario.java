package org.example.lambdas.function;

public class Usuario {
    private String firstName;
    private String lastName;
    private int age;
    private String cpf;

    public Usuario(String firstName, String lastName, int age, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cpf = cpf;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }
}
