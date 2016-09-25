package com.epam.training.first.shapes;

import com.epam.training.first.exception.NotCircleException;

import java.util.ArrayList;

public class Circle {
    private Point center;
    private int radius;

    private Circle(CircleBuilder cb) {
        this.radius = cb.radius;
        this.center = cb.center;
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

    public static class CircleBuilder {
        private Point center;
        private int radius;

        public CircleBuilder(int radius) {
            this.radius = radius;
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
                throw new NotCircleException(String.format("Circles with %d radius don't exist.", this.radius));
            }
            return new Circle(this);
        }

        public static ArrayList<Circle> createCircleList(ArrayList<ArrayList<Integer>> convertedData) {
            ArrayList<Circle> circleList = new ArrayList<>();
            for (ArrayList<Integer> singleCircle : convertedData) {
                if (singleCircle.size() > 1) {
                    Point currentCenter = new Point(singleCircle.get(1), singleCircle.get(2));
                    try {
                        circleList.add(new Circle.CircleBuilder(singleCircle.get(0)).center(currentCenter).build());
                    } catch (NotCircleException notCircle) {
                        System.out.println(notCircle);
                    }
                } else {
                    try {
                        circleList.add(new Circle.CircleBuilder(singleCircle.get(0)).build());
                    } catch (NotCircleException notCircle) {
                        System.out.println(notCircle);
                    }
                }
            }
            return circleList;
        }
    }

}
