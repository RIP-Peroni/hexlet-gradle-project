package main.java.hexlet.gradle.project;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomLinkedHM extends LinkedHashMap {
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > 3;
    }
}
