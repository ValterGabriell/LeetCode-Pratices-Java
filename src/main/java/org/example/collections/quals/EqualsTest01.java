package org.example.collections.quals;

import org.example.collections.dominio.SmarthPhone;
import org.example.collections.dominio.Televisao;


public class EqualsTest01 {
    public static void main(String[] args) {
        SmarthPhone s1 = new SmarthPhone("1abc1", "iphone");
        SmarthPhone s2 = new SmarthPhone("1abc1", "iphone");
        System.out.println(s1.equals(s2));
        Televisao televisao = new Televisao("marca12");
        Televisao televisao1 = new Televisao("marca12");
        System.out.println(televisao.equals(televisao1));
        System.out.println(televisao == televisao1);

        String name = "HELLO";
        String name1 = new String("HELLO");
        System.out.println(name.equals(name1));
        System.out.println(name == name1);

    }
}
