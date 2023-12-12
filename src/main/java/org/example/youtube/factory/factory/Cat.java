package org.example.youtube.factory.factory;

public class Cat extends Animal {
    protected Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void checkIn() {
        System.out.println("Check in: " + this.getName());
    }

    @Override
    public void checkOut() {
        System.out.println("Check out: " + this.getName());
    }
}
