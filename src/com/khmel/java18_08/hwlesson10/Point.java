package com.khmel.java18_08.hwlesson10;

public class Point{
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point a, Point b ) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }
    public double distanceToNull(Point o){
        return Math.sqrt(Math.pow((x - o.x), 2) + Math.pow((y - o.y), 2));
    }
    public void moveX(double dx){
      x+=dx;
    }
    public void moveY(double dy){
        y+=dy;
    }

    public String toString() {
        return "("+x+";"+y+")";
    }

    public void print() {
        System.out.print(this.toString());
    }
    public static void main(String[] args) {
        Point a = new Point(10,20);
        Point b = new Point(5,10);
        Point o = new Point();
        System.out.println(Point.distance(a,b));
        System.out.println(a.distanceToNull(o));
        a.moveX(5);
        a.moveY(5);
        a.print();
    }
}
