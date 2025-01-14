package core;

import java.util.List;

public class Rectangle {
    private final Point topLeft;
    private final Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int calculateArea() {
        int width = Math.abs(topLeft.getX() - bottomRight.getX());
        int height = Math.abs(topLeft.getY() - bottomRight.getY());
        return width * height;
    }

    public static Rectangle fromPoints(List<Point> points) {
        if (!Validation.isValidRectangle(points)) {
            throw new IllegalArgumentException("Points do not form a valid rectangle.");
        }
        Point topLeft = points.get(0);
        Point bottomRight = points.get(2);
        return new Rectangle(topLeft, bottomRight);
    }
}
