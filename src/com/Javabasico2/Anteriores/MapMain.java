package com.Javabasico2.Anteriores;

import java.util.HashMap;
import java.util.Map;
public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();
        personas.put("11235678", "Name1");
        personas.put("15698252", "Name2");
        personas.put("159846213", "Name3");
        personas.put("321583012", "Name4");

        System.out.println(personas);

        for (String key : personas.values()) {
            System.out.println(key);
        }
        for (Map.Entry<String,String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }
}
