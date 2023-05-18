package org.example.teste;

import java.util.LinkedHashSet;

public class Herdeira extends Herdada{
    public Herdeira(){
        this(4);
    }
    Herdeira(int num){

    }

    public void teste(){
        int controle = 1;
        try {
            for (;true;controle--){
                if ((controle / --controle) <= 0){
                    break;
                }
            }
        }catch (ArithmeticException e){
            System.out.println("A");
        }catch (RuntimeException e){
            System.out.println("B");
        }catch (Exception e){
            System.out.println("C");
        }finally {
            System.out.println("D");
        }
    }

}
