package org.example.collections.MapTest01;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mauze", "mouse");
        map.put("vc", "você");
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("________________________");
        for (String values : map.values()) {
            System.out.println(values);
        }
        System.out.println("________________________");
        for (Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}
