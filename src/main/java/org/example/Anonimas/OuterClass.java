package org.example.Anonimas;

public class OuterClass {
    int number = 7;

    public void smtg() {
        System.out.println("Ola!");
        class LocalInnerClass {
            String localInner = "hehehe";

            public void print() {
                System.out.println(localInner);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.print();
    }

    public class InnerClass {
        int innerNumber = 8;
        public void whatsapp() {
            System.out.println("Inner");
        }
    }
}
