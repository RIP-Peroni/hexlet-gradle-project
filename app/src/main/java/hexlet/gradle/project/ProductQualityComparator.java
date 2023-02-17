package main.java.hexlet.gradle.project;

import java.util.Comparator;

public class ProductQualityComparator implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getQuality(), o2.getQuality());
    }
}
