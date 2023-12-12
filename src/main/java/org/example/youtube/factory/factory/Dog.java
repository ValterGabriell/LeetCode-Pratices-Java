package org.example.youtube.factory.factory;

public class Dog extends Animal {
    protected Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void checkIn() {
        System.out.println("Check in: " + this.getName().isBlank());
    }

    @Override
    public void checkOut() {
        System.out.println("Check out: " + this.getName());
    }
}
