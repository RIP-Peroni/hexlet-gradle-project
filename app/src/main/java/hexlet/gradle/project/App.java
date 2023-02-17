package main.java.hexlet.gradle.project;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Gamer, String> hm = new HashMap<>();

        Gamer gamer1 = new Gamer(1L, "Dinotrex", "dD34!dfj");
        Gamer gamer2 = new Gamer(1L, "Dinotrex", "dD34!dfj");

        hm.put(gamer1, "level1");
        System.out.println(hm.get(gamer1));
        gamer1.setPassword("icvd(8df3!");
        System.out.println(hm.get(gamer1));
        System.out.println(hm.get(gamer2));
    }
}
