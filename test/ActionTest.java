import com.epam.training.first.action.Action;
import com.epam.training.first.builder.CircleBuilder;
import com.epam.training.first.entity.Circle;
import com.epam.training.first.entity.Point;
import com.epam.training.first.exception.NotCircleException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class ActionTest {
    @Test
    public void calcAreaTest() throws NotCircleException {
        Circle c = new CircleBuilder(2).build();
        assertEquals(12.56, Action.calculateArea(c), 0.01);
    }

    @Test
    public void calcPerimeterTest() throws NotCircleException {
        Circle c = new CircleBuilder(2).build();
        assertEquals(12.56, Action.calculatePerimeter(c), 0.01);
    }

    @Test
    public void intersectionTrueTest() throws NotCircleException {
        Circle c = new CircleBuilder(2).center(new Point(3, 1)).build();
        assertTrue(Action.doesIntersect(c, 1));
    }

    @Test
    public void intersectionFalseTest() throws NotCircleException {
        Circle c = new CircleBuilder(2).center(new Point(1, -1)).build();
        assertFalse(Action.doesIntersect(c, 1));
    }
}
