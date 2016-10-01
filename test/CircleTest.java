import com.epam.training.first.builder.CircleBuilder;
import com.epam.training.first.entity.Circle;
import com.epam.training.first.entity.Point;
import com.epam.training.first.exception.NotCircleException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CircleTest {

    @Test(expected = NotCircleException.class)
    public void isCircle() throws NotCircleException {
        Circle c1 = new CircleBuilder(-1).build();
    }

    @Test
    public void equalsTest() throws NotCircleException {
        Circle c1 = new CircleBuilder(1).center(new Point(0, 0)).build();
        Circle c2 = new CircleBuilder(1).build();
        assertTrue(c1.equals(c2));
    }
}
