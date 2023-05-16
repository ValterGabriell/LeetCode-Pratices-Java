package org.example.innerclass;

public class OuterClassesTest03 {
    private String name;
    static class NestedClass {
        private void print(){
            System.out.println(new OuterClassesTest03().name);
        }
    }
    public static void main(String[] args) {

    }
}
