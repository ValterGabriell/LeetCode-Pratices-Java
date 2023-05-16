package org.example.innerclass;

public class OuterTest02 {

    private String name = "Miasaky";

    public static void main(String[] args) {
        OuterTest02 ot = new OuterTest02();
        ot.print();
    }

    void print() {
        class InnerMethod {
            public void printLocal(){
                System.out.println(name);
            }
        }
        InnerMethod innerMethod = new InnerMethod();
        innerMethod.printLocal();
    }
}
