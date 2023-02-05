package hexlet.gradle.project;

public final class Circle implements Geometric {

    private final int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public int getSquare() {
        var square = Math.PI * radius * radius;
        return (int) square;
    }

    public String getName() {
        return "circle";
    }
}