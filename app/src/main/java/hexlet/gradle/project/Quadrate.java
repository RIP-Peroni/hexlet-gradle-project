package hexlet.gradle.project;

public final class Quadrate implements Geometric {
    private final int side;
    Quadrate(int side) {
        this.side = side;
    }
    public String getName() {
        return "quadrate";
    }
    public int getSquare() {
        return side * side;
    }
}