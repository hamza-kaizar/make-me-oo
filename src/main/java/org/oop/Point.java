package org.oop;

public class Point {
    private double x;
    private double y;

    public double distanceBetween(Point point) {
        double xDistance = point.x - this.x;
        double yDistance = point.y - this.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double directionTo(Point point) {
        double xDistance = point.x - this.x;
        double yDistance = point.y - this.y;
        return Math.atan2(yDistance, xDistance);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
