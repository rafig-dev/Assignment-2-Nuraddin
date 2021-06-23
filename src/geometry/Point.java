package geometry;

public class Point {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double distance(Point p) {
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public int inWhichQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y > 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }

    public static int inWhichQuadrant(Point p) {
        if (p.x > 0 && p.y > 0) {
            return 1;
        }
        if (p.x < 0 && p.y > 0) {
            return 2;
        }
        if (p.x < 0 && p.y < 0) {
            return 3;
        }
        if (p.x > 0 && p.y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Point p) {
        boolean bool1 = this.x == p.getX();
        boolean bool2 = this.y == p.getY();

        return bool1 && bool2;
    }
}
