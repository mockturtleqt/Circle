package com.epam.training.first.action;

import com.epam.training.first.entity.Circle;


public class Action {
    public static double calculateArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public static double calculatePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public static boolean doesIntersect(Circle circle, int distance) {
        int absXcenter = Math.abs(circle.getCenter().getX());
        int absYcenter = Math.abs(circle.getCenter().getY());
        return (absXcenter != absYcenter) &&
                (circle.getRadius() - absXcenter == distance ||
                        circle.getRadius() - absYcenter == distance);
    }
}
