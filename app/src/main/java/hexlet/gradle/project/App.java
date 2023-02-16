package hexlet.gradle.project;

import java.util.*;

public class App {
    public static void main(String[] args) {
//        String sentence = "the java is the best programming language java";
        String sentence = "";
        Map wordsCount = getWordCount(sentence);
        String result = toString(wordsCount);
        System.out.println(result);
    }

    public static Map getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<String, Integer>();
        }
        List<String> sentenceArr = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        System.out.println("sentenceArr " + sentenceArr);
        Map<String, Integer> result = new HashMap<>();
        System.out.println("result " + result);

        for (String word: sentenceArr) {
            if (result.get(word) == null) {
                System.out.println("tut null");
                result.put(word, 0);
            }
            result.put(word, result.get(word) + 1);
        }
        return result;
    }

    public static String toString(Map wordsCount) {
        if (wordsCount.size() == 0) {
            return "{}";
        }
        System.out.println(wordsCount);
        List<String> resultArr = new ArrayList<>();
        Map<String, Integer> newWordsCount = new HashMap<>();
        newWordsCount.putAll(wordsCount);
        for (Map.Entry<String, Integer> entry: newWordsCount.entrySet()) {
            System.out.println("entry: " + entry);
            resultArr.add(entry.getKey() + ": " + entry.getValue());
        }
        return "{\n  " + String.join("\n  ", resultArr) + "\n}";
    }
}
