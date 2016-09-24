package com.epam.training.first.action;

import com.epam.training.first.shapes.Circle;

public class Action {
    public static double calculateArea(Circle circle) {
        return 3.14 * circle.getRadius() * circle.getRadius();
    }

    public static double calculatePerimeter(Circle circle) {
        return 2 * 3.14 * circle.getRadius();
    }
}
