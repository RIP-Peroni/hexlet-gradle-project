package hexlet.gradle.project;

public final class Random {
    private final int startValue;
    private int currentValue;
    Random(int start) {
        startValue = start;
        currentValue = start;
    }
    public int getNext() {
        int result = (7 * currentValue + 7) % 10;
        currentValue = result;
        return result;
    }
    public void reset() {
        currentValue = startValue;
    }
}