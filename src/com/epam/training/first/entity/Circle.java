package com.epam.training.first.entity;


public class Circle {
    private Point center;
    private int radius;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (radius != circle.radius) return false;
        return center.equals(circle.center);

    }

    @Override
    public int hashCode() {
        int result = center.hashCode();
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Circle {center = %s, radius = %s}", center, radius);
    }

}
