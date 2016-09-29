package com.epam.training.first.builder;

import com.epam.training.first.entity.Circle;
import com.epam.training.first.entity.Point;
import com.epam.training.first.exception.NotCircleException;
import org.apache.log4j.Logger;


public class CircleBuilder {
    private static Logger logger = Logger.getLogger(CircleBuilder.class);
    private Point center;
    private int radius;

    public CircleBuilder(int radius) {
        this.radius = radius;
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

    public static Circle createCircle(int[] data) {
        Circle c = null;
        Point center = (data.length == 3) ? new Point(data[1], data[2]) : new Point(0, 0);
        try {
            c = new CircleBuilder(data[0]).center(center).build();
        } catch (NotCircleException e) {
            logger.error(e);
        }
        return c;
    }
}
