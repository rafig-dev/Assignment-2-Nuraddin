package geometry;

public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Point getVertex1() {
        return vertex1;
    }

    public void setVertex1(Point vertex1) {
        this.vertex1 = vertex1;
    }

    public Point getVertex2() {
        return vertex2;
    }

    public void setVertex2(Point vertex2) {
        this.vertex2 = vertex2;
    }

    public Point getVertex3() {
        return vertex3;
    }

    public void setVertex3(Point vertex3) {
        this.vertex3 = vertex3;
    }

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
    public Triangle(Triangle triangle) {
        this.vertex1 = triangle.getVertex1();
        this.vertex2 = triangle.getVertex2();
        this.vertex3 = triangle.getVertex3();
    }
    public double area() {
        double side1 = vertex1.distance(vertex2);
        double side2 = vertex2.distance(vertex3);
        double side3 = vertex1.distance(vertex3);

        double semiPerimeter = (side1 + side2 + side3) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * semiPerimeter- side3);
    }
    public double perimeter() {
        double side1 = vertex1.distance(vertex2);
        double side2 = vertex2.distance(vertex3);
        double side3 = vertex1.distance(vertex3);

        return side1 + side2 + side3;
    }
    public int inWhichQuadrant() {
        if (vertex1.inWhichQuadrant() == 1 && vertex2.inWhichQuadrant() == 1 &&
                vertex3.inWhichQuadrant() == 1) {
            return 1;
        }
        if (vertex1.inWhichQuadrant() == 2 && vertex2.inWhichQuadrant() == 2 &&
                vertex3.inWhichQuadrant() == 2) {
            return 2;
        }
        if (vertex1.inWhichQuadrant() == 3 && vertex2.inWhichQuadrant() == 3 &&
                vertex3.inWhichQuadrant() == 3) {
            return 3;
        }
        else {
            return 0;
        }
    }
    public String toString() {
        return "[" + "(" + this.getVertex1().getX() + ", " + this.getVertex1().getY() + ")" + "," + "(" + this.getVertex2().getX() + ", " + this.getVertex2().getY() + ")" + "," + "(" + this.getVertex3().getX() + ", " + this.getVertex3().getY() + ")" + "]";
    }
    public boolean equals(Triangle t) {
        boolean bool1 = this.vertex1.equals(t.getVertex1());
        boolean bool2 = this.vertex2.equals(t.getVertex2());
        boolean bool3 = this.vertex3.equals(t.getVertex3());

        return bool1 && bool2 && bool3;
    }
}
