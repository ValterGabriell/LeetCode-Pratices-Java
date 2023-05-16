package org.example.collections.Listas;

import org.example.collections.dominio.SmarthPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmarthPhone s1 = new SmarthPhone("1abc1", "iphone");
        SmarthPhone s2 = new SmarthPhone("2222", "Pixel");
        SmarthPhone s3 = new SmarthPhone("3333", "samsumg");

        List<SmarthPhone> smarthPhones = new ArrayList<>(6);
        smarthPhones.add(s1);
        smarthPhones.add(s2);
        smarthPhones.add(s3);
        for (SmarthPhone sm : smarthPhones){
            System.out.println(sm);
        }
        SmarthPhone s4 = new SmarthPhone("3333", "samsumg");
        boolean contains = smarthPhones.contains(s4);
        System.out.println(contains);
        int indexSmartPhone4 = smarthPhones.indexOf(s4);
        System.out.println(indexSmartPhone4);
    }
}
