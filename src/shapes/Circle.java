package shapes;

public class Circle {
    private Point center = new Point(0, 0);
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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

}
