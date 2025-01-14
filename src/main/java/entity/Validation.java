package core;

import java.util.List;

public class Validation {
    public static boolean isValidRectangle(List<Point> points) {
        return points.size() == 4 &&
                points.get(0).getY() == points.get(1).getY() &&
                points.get(2).getY() == points.get(3).getY() &&
                points.get(0).getX() == points.get(3).getX() &&
                points.get(1).getX() == points.get(2).getX();
    }
}
