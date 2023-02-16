package hexlet.gradle.project;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.set(1, 4);

        System.out.println(list);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list.addAll(list2);
        System.out.println(list);
    }
}
