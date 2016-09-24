import action.Action;
import shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);

        System.out.println(Action.calculateArea(c1));
        System.out.println(Action.calculatePerimeter(c1));
        System.out.println(c1);
    }
}
