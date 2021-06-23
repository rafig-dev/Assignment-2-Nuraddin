package main;
import geometry.Rectangle;
import geometry.Triangle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(0, 5), new Point(6, 0));
        Rectangle r2 = new Rectangle(0, 3, 4, 0);
        Rectangle r3 = new Rectangle(r2);
        Rectangle r4 = new Rectangle(new Point(-3, 5), new Point(-1, 2));
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4.inWhichQuadrant());
        System.out.println(r1.equals(r2));
        System.out.println(r2.equals(r3));
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        Triangle t1 = new Triangle(new Point(3, 5), new Point(), new Point(1, 4));
        Triangle t2 = new Triangle(t1);
        Triangle t3 = new Triangle(new Point(3, 4), new Point(1, 2), new Point(1, 3));
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t3.inWhichQuadrant());
        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t3));
        System.out.println(t1.area());
        System.out.println(t1.perimeter());
    }
}
