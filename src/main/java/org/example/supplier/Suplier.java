package org.example.supplier;

import java.util.function.Supplier;

public class Suplier {
    public static void main(String[] args) {
        Supplier<DoSomething> doSomethingSuplier = () -> DoSomething.doSomething();

       doSomethingSuplier.get();
       doSomethingSuplier.get();
       doSomethingSuplier.get();
       doSomethingSuplier.get();

    }
}

class DoSomething{
    public static DoSomething doSomething(){
        System.out.println("do");
        return new DoSomething();
    }
}

