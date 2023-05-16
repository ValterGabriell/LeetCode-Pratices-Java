package org.example.innerclass;

public class OuterClass {

    private String name = "Monkey D. Luffy";

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        Inner inner = oc.new Inner();
        inner.printOuterAttribute();
    }

    class Inner {
        public void printOuterAttribute() {
            System.out.println(name);
        }
    }
}
