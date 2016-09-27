import com.epam.training.first.action.Action;
import com.epam.training.first.exception.NotCircleException;
import com.epam.training.first.shapes.Circle;
import com.epam.training.first.shapes.CircleBuilder;
import org.junit.Test;

import static org.junit.Assert.*;


public class ActionTest {
    @Test
    public void calcAreaTest() throws NotCircleException{
        Circle c = new CircleBuilder(2).build();
        assertEquals(12.56, Action.calculateArea(c), 0.01);
    }

    @Test
    public void calcPerimeterTest() throws NotCircleException{
        Circle c = new CircleBuilder(2).build();
        assertEquals(12.56, Action.calculatePerimeter(c), 0.01);
    }
}
