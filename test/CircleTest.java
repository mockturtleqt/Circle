import com.epam.training.first.exception.NotCircleException;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;
import com.epam.training.first.shapes.Point;
import org.junit.*;
import java.lang.Math.*;
import java.io.*;
import static org.junit.Assert.*;


public class CircleTest{

    @Test(expected = NotCircleException.class)
    public void isCircle() throws NotCircleException{
        Circle c1 = new CircleBuilder(-1).build();
    }

    @Test
    public void intersectionTest() throws NotCircleException{
        int distance = 3;
        boolean doesIntersect = false;
        Circle c1 = null;
        c1 = new CircleBuilder(1).center(new Point(2, 3)).build();

        if (c1 != null) {
            int abs_x = Math.abs(c1.getCenter().getX());
            int abs_y = Math.abs(c1.getCenter().getY());
            if ((abs_x != abs_y) && (abs_x == distance) || (abs_y == distance)) {
                doesIntersect = true;
            }
        }
        assertTrue(doesIntersect);
    }

}
