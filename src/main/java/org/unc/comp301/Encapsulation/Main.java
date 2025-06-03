package org.unc.comp301.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(1,2);

        Point c = new Point(2,0);
        Point d = new Point(3,2);
        Point e = new Point(4,0);

        PointTriangle first = new PointTriangle(a,b,c);
        PointTriangle second = new PointTriangle(c,d,e);
        System.out.println(first);
        System.out.println(second);
        System.out.println(first.getPerimeter());
        System.out.println(second.getPerimeter());
        first.transpose(2,0);
        System.out.println(first.getPerimeter());
        System.out.println(second.getPerimeter());


    }
}