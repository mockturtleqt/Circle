import com.epam.training.first.entity.Point;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PointTest {
    @Test
    public void equalsTest() {
        Point p1 = new Point(2, 9);
        Point p2 = new Point(2, 9);
        assertTrue(p1.equals(p2));
    }
}
