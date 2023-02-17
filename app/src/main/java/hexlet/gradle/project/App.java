package main.java.hexlet.gradle.project;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1231, "Linus Torvalds");
        hm.put(36533, "Donald Knuth");
        hm.put(293216, "Larry Page");
        hm.put(246345, "Anders Hejlberg");
        System.out.println(hm);

        Map<Product, String> tm = new TreeMap<>();
        tm.put(new Product("milk", 70, 5), "drinks");
        tm.put(new Product("chocolate", 105, 3), "food");
        tm.put(new Product("eggs", 8, 3), "food");
        System.out.println(tm);
    }
}
