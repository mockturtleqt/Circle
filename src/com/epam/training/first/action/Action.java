package com.epam.training.first.action;

import java.lang.Math;

import com.epam.training.first.shapes.Circle;


public class Action {
    public static double calculateArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public static double calculatePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
}
