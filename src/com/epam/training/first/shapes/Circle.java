package com.epam.training.first.shapes;

import com.epam.training.first.exception.NotCircleException;

import java.util.ArrayList;

public class Circle {
    private Point center;
    private int radius;

    Circle(CircleBuilder cb) {
        this.radius = cb.getRadius();
        this.center = cb.getCenter();
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

        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circle {center = %s, radius = %s}", center, radius);
    }

}
