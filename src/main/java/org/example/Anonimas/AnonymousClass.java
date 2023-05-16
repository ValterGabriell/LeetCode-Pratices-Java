package org.example.Anonimas;


class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking into shadows");
            }
        };
        a.walk();
    }
}
