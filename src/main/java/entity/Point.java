package core;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Point fromString(String input) {
        String[] coordinates = input.replaceAll("[()]", "").split(",");
        return new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }
}
