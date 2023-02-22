package main.java.hexlet.gradle.project;

import java.util.List;
import java.util.Map;

public class Util {
    public static int getAmountOfUsers(List<User> users) {
        return users.size();
    }
    public static int getAmountOfBooks(Map<String, List<String>> map) {
        int result = 0;
        System.out.println(map.entrySet());
        for (Map.Entry<String, List<String>> authorAndBooks: map.entrySet()) {
            result = result + authorAndBooks.getValue().size();
        }
        return result;
    }
}
