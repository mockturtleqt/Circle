package com.epam.training.first.shapes;

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
        return "Circle {" +
                "center = " + center +
                ", radius = " + radius +
                '}';
    }

    public static class CircleBuilder {
        private Point center = new Point(0, 0);
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

        public CircleBuilder setCenter(Point c) {
            this.center = c;
            return this;
        }

        public Circle build() {
            return new Circle(this);
        }
    }

}
