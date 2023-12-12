package org.example.youtube.factory.factory;

public class CatEgipcy extends Cat{
    protected CatEgipcy(String name, int age) {
        super(name, age);
    }

    @Override
    public void checkIn() {
        System.out.println("Check in Gato Especial: " + this.getName());
    }
}
