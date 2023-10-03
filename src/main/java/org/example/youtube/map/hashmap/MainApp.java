package org.example.youtube.map.hashmap;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        HashMap<String, String> phoneConfigurationMap = new LinkedHashMap<>();

        phoneConfigurationMap.put("darkTheme", "true");
        phoneConfigurationMap.put("fontSize", "medium");
        phoneConfigurationMap.put("notificationsEnabled", "true");
        phoneConfigurationMap.put("language", "English");
        phoneConfigurationMap.put("airplaneMode", "false");

        System.out.println("Valores");
        Collection<String> values = phoneConfigurationMap.values();
        System.out.println(values);

        System.out.println();

        System.out.println("Chaves");
        Set<String> strings = phoneConfigurationMap.keySet();
        System.out.println(strings);

        System.out.println();
        for (Map.Entry<String, String> pc : phoneConfigurationMap.entrySet()){
            System.out.println(pc);
        }

        phoneConfigurationMap.put("darkTheme", "false");
        System.out.println();
        for (Map.Entry<String, String> pc : phoneConfigurationMap.entrySet()){
            System.out.println(pc);
        }

        phoneConfigurationMap.remove("darkTheme");
        System.out.println();
        for (Map.Entry<String, String> pc : phoneConfigurationMap.entrySet()){
            System.out.println(pc);
        }
    }
}
