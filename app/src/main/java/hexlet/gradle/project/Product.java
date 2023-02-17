package main.java.hexlet.gradle.project;

public class Product  implements Comparable<Product> {
    private String name;
    private Integer cost;
    private Integer quality;

    public Product(String name, Integer cost, Integer quality) {
        this.name = name;
        this.cost = cost;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /**
     * @param product 
     * @return
     */
    @Override
    public int compareTo(Product product) {
        return this.cost.compareTo(product.cost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", quality=" + quality +
                '}';
    }
}
