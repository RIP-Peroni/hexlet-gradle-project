package main.java.hexlet.gradle.project;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<Product, String> tm = new TreeMap<>(new ProductQualityComparator());
        tm.put(new Product("milk", 200, 5), "drinks");
        tm.put(new Product("chocolate", 105, 10), "food");
        tm.put(new Product("eggs", 8, 3), "food");
        System.out.println(tm);
    }
}
