package main.java.hexlet.gradle.project;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Gamer, String> hm = new HashMap<>();

        Gamer gamer1 = new Gamer(1L, "Dinotrex", "dD34!dfj");
        Gamer gamer2 = new Gamer(1L, "Dinotrex", "dD34!dfj");

        hm.put(gamer1, "level1");
        hm.put(gamer2, "level2");
        System.out.println(hm);

        System.out.println(gamer1.hashCode());
        System.out.println(gamer2.hashCode());

        System.out.println(gamer1.equals(gamer2));
    }
}
