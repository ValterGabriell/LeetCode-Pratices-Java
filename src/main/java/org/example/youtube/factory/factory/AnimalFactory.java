package org.example.youtube.factory.factory;

public class AnimalFactory {
    private AnimalFactory() {
    }
    public static Animal getInstance(String name, int age, boolean isDog){
        return isDog ? new Dog(name, age) : new Cat(name, age);
    }

    public static Animal getInstance(String name, int age, TYPE_ANIMAL typeAnimal){
        switch (typeAnimal){
            case CAT -> {
                return new Cat(name, age);
            }
            case DOG -> {
                return new Dog(name, age);
            }
            case CAT_ESPECIAL -> {
                return new CatEgipcy(name, age);
            }
            default -> throw new RuntimeException();
        }
    }
}
