package geometry;

public class Rectangle{
    private Point topLeft;
    private Point bottomRight;

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = new Point();
        this.bottomRight = new Point();
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public Rectangle(float xTopLeft, float yTopLeft, float xBottomRight, float yBottomRight) {
        this.topLeft = new Point();
        this.bottomRight = new Point();
        topLeft.setX(xTopLeft);
        topLeft.setY(yTopLeft);
        bottomRight.setX(xBottomRight);
        bottomRight.setY(yBottomRight);
    }
    public Rectangle(Rectangle rectangle) {
        topLeft = rectangle.topLeft;
        bottomRight = rectangle.bottomRight;
    }
    public double area() {
        Point topRight = new Point();
        topRight.setX(bottomRight.getX());
        topRight.setY(topLeft.getY());

        Point bottomLeft = new Point();
        bottomLeft.setX(topLeft.getX());
        bottomLeft.setY(bottomRight.getY());

        double side1 = Point.distance(topLeft, topRight);
        double side2 = Point.distance(topLeft, bottomLeft);

        return side1 * side2;
    }
    public double perimeter() {
        Point topRight = new Point();
        topRight.setX(bottomRight.getX());
        topRight.setY(topLeft.getY());

        Point bottomLeft = new Point();
        bottomLeft.setX(topLeft.getX());
        bottomLeft.setY(bottomRight.getY());

        double side1 = Point.distance(topLeft, topRight);
        double side2 = Point.distance(topLeft, bottomLeft);

        return 2 * (side1 + side2);
    }
    public int inWhichQuadrant() {
        if (topLeft.inWhichQuadrant() == 1 && bottomRight.inWhichQuadrant() == 1) {
            return 1;
        }
        if (topLeft.inWhichQuadrant() == 2 && bottomRight.inWhichQuadrant() == 2) {
            return 2;
        }
        if (topLeft.inWhichQuadrant() == 3 && bottomRight.inWhichQuadrant() == 3) {
            return 3;
        }
        if (topLeft.inWhichQuadrant() == 4 && bottomRight.inWhichQuadrant() == 4) {
            return 4;
        }
        return 0;
    }
    public String toString() {
        return "[" + "(" + this.getTopLeft().getX() + ", " + this.getTopLeft().getY() + ")" + "," + "(" + this.getBottomRight().getX() + ", " + this.getBottomRight().getY() + ")" + "]";
    }
    public boolean equals(Rectangle r) {
        boolean bool1 = topLeft.equals(r.topLeft);
        boolean bool2 = bottomRight.equals(r.bottomRight);

        if (bool1 && bool2) {
            return true;
        }
        else {
            return false;
        }
    }
}
