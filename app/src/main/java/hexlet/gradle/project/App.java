package main.java.hexlet.gradle.project;

import java.util.*;

public class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> uniqueKeys = new TreeSet<>();
        uniqueKeys.addAll(map1.keySet());
        uniqueKeys.addAll(map2.keySet());
        for (String key: uniqueKeys) {
            Object oldValue = map1.get(key);
            Object newValue = map2.get(key);
            if (!map2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (!map1.containsKey(key)) {
                result.put(key, "added");
            } else if (!Objects.equals(oldValue, newValue)) {
                result.put(key, "changed");
            } else {
                result.put(key, "unchanged");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Map<String, Object> data1 = new HashMap<>(
                Map.of("one", "eon", "two", "two", "four", true, "abs", 'h')
        );
        Map<String, Object> data2 = new HashMap<>(
                Map.of("two", "own", "zero", 4, "four", true)
        );
        System.out.println(genDiff(data1, data2));
    }
}
