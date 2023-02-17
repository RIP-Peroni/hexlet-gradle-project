package main.java.hexlet.gradle.project;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> lhm = new CustomLinkedHM();
        lhm.put(1, "");
        lhm.put(2, "");
        lhm.put(3, "");
        System.out.println(lhm);
        lhm.get(1);

        System.out.println(lhm);
        lhm.put(4, "");
        System.out.println(lhm);
        lhm.put(5, "");
        System.out.println(lhm);
    }
}
