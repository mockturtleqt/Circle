package com.epam.training.first.builder;

import com.epam.training.first.entity.Circle;
import com.epam.training.first.entity.Point;
import com.epam.training.first.exception.NotCircleException;


public class CircleBuilder {
    private Point center;
    private int radius;

    public CircleBuilder(int radius) {
        this.radius = radius;
    }

    public CircleBuilder(int[] data) {
        this.radius = data[0];
        if (data.length == 3) {
            this.center = new Point(data[1], data[2]);
        }
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public CircleBuilder center(Point c) {
        this.center = c;
        return this;
    }

    public Circle build() throws NotCircleException {
        if (this.center == null) {
            this.center = new Point(0, 0);
        }
        if (this.radius <= 0) {
            throw new NotCircleException("There are no circles with " + this.radius + " radius");
        }
        return new Circle(this);
    }
}
